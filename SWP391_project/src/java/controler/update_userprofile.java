/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        String fullname = request.getParameter("fullname").trim();
        String address = request.getParameter("address").trim();
        String email = request.getParameter("email").trim();
        String phonenumber = request.getParameter("phonenumber").trim();
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));

        Date dob = null;
        try {
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = (Date) formatter.parse(request.getParameter("dob"));
            DateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
            String finalDob = formatter1.format(date);
            dob = new SimpleDateFormat("dd/MM/yyyy").parse(finalDob);
           
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        String uploadFolder = request.getServletContext().getRealPath("/img_upload");
        Path uploadPath = Paths.get(uploadFolder);
        if (!Files.exists(uploadPath)) {
            Files.createDirectory(uploadPath); // neu chua ton tai foder img_upload thi tao
        }
        Part imagePart = request.getPart("image"); // tra ve doi tuong file 'image'
        String imageFilename = Paths.get(imagePart.getSubmittedFileName()).getFileName().toString();
        imagePart.write(Paths.get(uploadPath.toString(), imageFilename).toString()); //save to foder 'img_upload'
        
        System.out.println(fullname+" | "+address+" | "+email+" | "+phonenumber+" | "+gender+" | "+dob+" | "+imageFilename);
    }

}
