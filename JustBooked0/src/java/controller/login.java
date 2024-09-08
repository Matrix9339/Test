package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import oracle.jdbc.OracleConnection;

/**
 *
 * @author Sandipan
 */
@WebServlet("/login_page")
public class login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        processRequest(request, response);
        
        HttpSession session = request.getSession();
        session.invalidate();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String uemail = request.getParameter("email");
        String upass = request.getParameter("pass");
        HttpSession session;
        session = request.getSession();
        RequestDispatcher dispatcher = null;
        OracleConnection con = null;

        if (uemail == null || uemail.equals("")) {
            request.setAttribute("status", "invalidEmail");
            dispatcher = request.getRequestDispatcher("login_page.jsp");
            dispatcher.forward(request, response);
        }
        if (upass == null || upass.equals("")) {
            request.setAttribute("status", "invalidPassword !");
            dispatcher = request.getRequestDispatcher("login_page.jsp");
            dispatcher.forward(request, response);
        }
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            con = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Himanshu:1521:orcl10", "BOOK", "DATABASE");

            String query = "select * from REGISTER where MAIL = ? and PASS = ? ";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, uemail);
            pst.setString(2, upass);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                session.setAttribute("name", rs.getString("FIRST_NAME"));
                dispatcher = request.getRequestDispatcher("index.jsp");
            } else {
                request.setAttribute("status", "failed");
                dispatcher = request.getRequestDispatcher("login_page.jsp");
            }
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
