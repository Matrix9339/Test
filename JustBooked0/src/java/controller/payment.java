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

@WebServlet("/payment")
public class payment extends HttpServlet {

    String f_name,mail,address,city,state,zip,nameoncard,ccnum,expm,expy,cvv;

    // STEP 1: DECLARING ORACLE OBJECTS
    OracleConnection oconn;
    OraclePreparedStatement ops;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            RequestDispatcher dispatcher = null;

            f_name = request.getParameter("cname");
            mail = request.getParameter("cemail");
            address = request.getParameter("cadd");
            city = request.getParameter("cc");
            state = request.getParameter("conz");
            zip = request.getParameter("zip");
            nameoncard = request.getParameter("nameoc");
            ccnum = request.getParameter("ccno");
            expm = request.getParameter("mon");
            expy = request.getParameter("expy");
            cvv = request.getParameter("cvv");
            try {
                // STEP 2: REGISTERING THE ORACLE DRIVER WITH THIS SERVLEt
                DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

                // STEP 3: INSTANTIATING THE ORACLE CONNECTION OBJECT
                oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Himanshu:1521:orcl10", "BOOK", "DATABASE");

                // STEP 4: INSTANTIATING THE ORACLE PREPARED STATEMENT OBJECT
                ops = (OraclePreparedStatement) oconn.prepareCall("INSERT INTO PAYMENT(FULLNAME,EMAIL,ADDRESS,CITY,ZIP,NAME_ON_CARD,CCNUM,EXPM,EXPY,CVV,STATE) values(?,?,?,?,?,?,?,?,?,?,?)");

                // STEP 5: CONVERTING JAVA DATE FORMAT TO ORACLE DATE FORMAT
                //STEP 6: FILLING UP THE BLANK QUERY PARAMETERS (?)
                ops.setString(1, f_name);
                ops.setString(2, mail);
                ops.setString(3, address);
                ops.setString(4, city);     
                ops.setString(5, zip);
                ops.setString(6, nameoncard);
                ops.setString(7, ccnum);
                ops.setString(8, expm);
                ops.setString(9, expy);
                ops.setString(10, cvv);
                ops.setString(11,state );
                // STEP 7: EXECUTING THE QUERY
                int x = ops.executeUpdate();
                dispatcher = request.getRequestDispatcher("index.jsp");
                if (x > 0) {
                    dispatcher = request.getRequestDispatcher("index.jsp");
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
