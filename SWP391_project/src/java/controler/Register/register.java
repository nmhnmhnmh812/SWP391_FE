/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controler.Register;

import dal.DAO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Date;
import other.Email;
import other.SendEmail;
import utility.Utilities;

/**
 *
 * @author Admin
 */
public class register extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("view/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAO dao = new DAO();
        Utilities uti = new Utilities();

        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String fullname = request.getParameter("fullname");
        String phonenumber = request.getParameter("phonenumbers");
        String address = request.getParameter("address");
        Boolean gender = request.getParameter("gender").equals("male") ? true : false;
        String date = request.getParameter("dob");
        Date dob = Date.valueOf(date);

        if (!uti.checkExistedEmail(email)) {
            request.setAttribute("errExistedEmail", "This email has been used");
        } else if (!uti.checkExistedUsername(username)) {
            request.setAttribute("errExistedUsername", "This username has been used");
        } 
        else 
        {
            try {
                String url = request.getScheme() + "://"
                        + request.getServerName() + ":"
                        + request.getServerPort()
                        + request.getContextPath()
                        + "/verify?username=" + username + "&status=active";

                SendEmail se = new SendEmail();
                Email emailSend = new Email();
                emailSend.setFrom("thanhnmhe161531@fpt.edu.vn");        //from mail's infor
                emailSend.setFromPassword("Nguyenthanh29200@");     //from mail's infor
                emailSend.setTo(email);                                     //receive mail's infor
                emailSend.setSubject("Verify account");                 //mail's subject
                StringBuilder sb = new StringBuilder();
                sb.append("Dear").append(fullname).append(", Click this link to <b>").append("<a href='" + url + "'>ACTIVE</a>").append("</b>");
                emailSend.setContent(sb.toString());                    //mail's content
                se.sendEmail(emailSend);                                // sending mail

                request.setAttribute("mailSended", "Link to active account sended to your email");

                // insert account to db with status: inactive
                dao.register(username, password, email, dob, fullname, address, gender, "avtuser.png", phonenumber);
            } catch (Exception exc) {
                request.setAttribute("errorWhileSendMail", exc.getMessage());
            }
        }
        request.getRequestDispatcher("view/register.jsp").forward(request, response);
    }
}
