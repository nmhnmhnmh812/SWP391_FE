/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controler;

import dal.DAO;
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;
import java.nio.file.*;
import java.text.*;
import java.sql.Date;
import model.*;

/**
 *
 * @author Admin
 */
@MultipartConfig
public class update_userprofile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("view/home.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession ses = request.getSession();
        User user = (User) ses.getAttribute("user");
        
        String fullname = request.getParameter("fullname").trim();
        String address = request.getParameter("address").trim();
        String email = request.getParameter("email").trim();
        String phonenumber = request.getParameter("phonenumber").trim();
        boolean gender = request.getParameter("gender").equals("male") ? true : false;
        
        String date = request.getParameter("dob");
        Date dob = Date.valueOf(date);


        String uploadFolder = request.getServletContext().getRealPath("/img_upload");
        Path uploadPath = Paths.get(uploadFolder);
        if (!Files.exists(uploadPath)) {
            Files.createDirectory(uploadPath); // neu chua ton tai foder img_upload thi tao
        }
        Part imagePart = request.getPart("image"); // tra ve doi tuong file 'image'
        String imageFilename = Paths.get(imagePart.getSubmittedFileName()).getFileName().toString();

        if (!imageFilename.equals("")) {
            imagePart.write(Paths.get(uploadPath.toString(), imageFilename).toString()); //save to foder 'img_upload'
        }        
//        System.out.println(fullname + " | " + address + " | " + email + " | " + phonenumber + " | " + gender + " | " + dob + " | " +imageFilename);
    
        DAO dao = new DAO();
        
        // nho sua 8 = user.getUserId();
        dao.updateUserProfile(imageFilename, fullname, dob, address, email, phonenumber, gender, 8);
    }

}
