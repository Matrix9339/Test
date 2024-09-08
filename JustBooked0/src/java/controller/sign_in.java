package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;

@WebServlet("/sign_in")
public class sign_in extends HttpServlet {

    String F_name, L_name, mob, mail, pss, cnfpss;

    // STEP 1: DECLARING ORACLE OBJECTS
    OracleConnection oconn;
    OraclePreparedStatement ops;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            RequestDispatcher dispatcher = null;

            F_name = request.getParameter("fname");
            L_name = request.getParameter("lname");
            mob = request.getParameter("phone");
            mail = request.getParameter("email_id");
            pss = request.getParameter("pas");
            cnfpss = request.getParameter("cnfpas");
            try {
                // STEP 2: REGISTERING THE ORACLE DRIVER WITH THIS SERVLEt
                DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

                // STEP 3: INSTANTIATING THE ORACLE CONNECTION OBJECT
                oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Himanshu:1521:orcl10", "BOOK", "DATABASE");

                // STEP 4: INSTANTIATING THE ORACLE PREPARED STATEMENT OBJECT
                ops = (OraclePreparedStatement) oconn.prepareCall("INSERT INTO REGISTER(FIRST_NAME,LAST_NAME,PHONE_NO,MAIL,PASS,CNF_PAS) values(?,?,?,?,?,?)");

                // STEP 5: CONVERTING JAVA DATE FORMAT TO ORACLE DATE FORMAT
                //STEP 6: FILLING UP THE BLANK QUERY PARAMETERS (?)
                ops.setString(1, F_name);
                ops.setString(2, L_name);
                ops.setString(3, mob);
                ops.setString(4, mail);
                ops.setString(5, pss);
                ops.setString(6, cnfpss);

                // STEP 7: EXECUTING THE QUERY
                int x = ops.executeUpdate();
                dispatcher = request.getRequestDispatcher("login_page.jsp");
                if (x > 0) {
                    dispatcher = request.getRequestDispatcher("login_page.jsp");
                } else {
                    out.println("<h2 style='color:brown'> Record could not be added...");
                }
                dispatcher.forward(request, response);

                //STEP 8: CLOSING THE ORACLE OBJECTS
                ops.close();
                oconn.close();

            } //STEP 9: FORMATTING THE CATCH CLAUSE
            catch (SQLException ex) {
                Logger.getLogger(WorkRegister.class.getName()).log(Level.SEVERE, null, ex);
                out.println("<h2 style='color:red'> Error is : " + ex.toString() + "</h2>");
            }

            out.println("</head>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
