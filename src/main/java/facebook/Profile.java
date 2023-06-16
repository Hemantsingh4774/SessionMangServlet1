package facebook;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class Profile extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession ss2 = req.getSession();
        String username= (String) ss2.getAttribute("eml");
        if(username!=null){
            resp.sendRedirect("Profile.html");
        }
        else{
            PrintWriter  out = resp.getWriter();
            RequestDispatcher obj = req.getRequestDispatcher("Login.html");
            obj.include(req,resp);
            out.append("Please Login First");
        }
    }
}
