package controler;

import dal.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;
import utility.Utilities;

/**
 *
 * @author Admin
 */
public class usesrprofile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Utilities uti = new Utilities();
        HttpSession ses = request.getSession();

        User user = (User) ses.getAttribute("user");
        if (uti.getUser(user.getUserId()) != null) { //tim duoc doi tuong va load thong tin
            request.setAttribute("userinfor", uti.getUser(user.getUserId()));
        } 
        else response.sendRedirect("home"); // ko tim duoc doi tuong chuyen ve trang home
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
