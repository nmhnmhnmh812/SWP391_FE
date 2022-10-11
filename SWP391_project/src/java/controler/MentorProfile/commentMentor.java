/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controler.MentorProfile;

import dal.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Comment;
import model.Mentee;
import model.Mentor;
import model.Rating;
import model.User;
import utility.Utilities;

/**
 *
 * @author Admin
 */
public class commentMentor extends HttpServlet {

    DAO d = new DAO();
    Utilities u = new Utilities();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet commentMentor</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet commentMentor at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        int rate = Integer.parseInt(request.getParameter("rate"));
        String comment = request.getParameter("comment");
        //get current user
        User U = (User) request.getSession().getAttribute("user");
        //get mentorID in URL
        int mentorID = Integer.parseInt(request.getParameter("hiddenID"));
        Mentor m = new Mentor();
        m.setMentorID(mentorID);
        //get mentee of current user
        Mentee mentee = d.getMentee(U);
        //create new comment
        Comment c = new Comment();
        c.setCmtContent(comment);
        c.setMentee(mentee);
        c.setMentor(m);
        //insert comment to db
        d.insertComment(c);
        //create new rate
        Rating r = new Rating();
        r.setMentee(mentee);
        r.setMentor(m);
        r.setRateStar(rate);
        d.insertRate(r);
        
//        String url = "mentorprofile?mentorID" + m.getMentorID();
//        response.sendRedirect(url);
        

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
