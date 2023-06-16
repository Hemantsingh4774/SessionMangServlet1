package facebook;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String pass = req.getParameter("pass");

        // values in the database
        String dbid="abc@gmail.com";
        String dbpass="12345";

        if(dbid.equals(id) && dbpass.equals(pass)){
            HttpSession ss = req.getSession();
            ss.setAttribute("eml",id);
            resp.sendRedirect("profile");
        }
        else{
            resp.sendRedirect("Login.html");
        }
    }
}
