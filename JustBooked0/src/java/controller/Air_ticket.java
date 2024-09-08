///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import oracle.jdbc.OracleConnection;
//import oracle.jdbc.OraclePreparedStatement;
//
///**
// *
// * @author Himanshu
// */
//
//@WebServlet("/Air_ticket")
//public class Air_ticket extends HttpServlet {
// String trip,cabin,dfrom,desto,depart,adlt,chld,infnt,typef;
//
//    // STEP 1: DECLARING ORACLE OBJECTS
//    OracleConnection oconn;
//    OraclePreparedStatement ops;
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException, ParseException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//
//            RequestDispatcher dispatcher = null;
//
//            trip = request.getParameter("way");
//            cabin = request.getParameter("cabin");
//            dfrom = request.getParameter("from");
//            desto = request.getParameter("to");
//            depart = request.getParameter("Departure");
//            adlt = request.getParameter("adult");
//            chld = request.getParameter("child");
//            infnt = request.getParameter("inf");
//            
//            try {
//                // STEP 2: REGISTERING THE ORACLE DRIVER WITH THIS SERVLEt
//                DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
//
//                // STEP 3: INSTANTIATING THE ORACLE CONNECTION OBJECT
//                oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Himanshu:1521:orcl10", "BOOK", "DATABASE");
//
//                // STEP 4: INSTANTIATING THE ORACLE PREPARED STATEMENT OBJECT
//                ops = (OraclePreparedStatement) oconn.prepareCall("INSERT INTO PAYMENT(TRIP,CABIN,DFROM,DESTO,DEPART,ADLT,CHLD,INFNT) values(?,?,?,?,?,?,?,?,?)");
//
//                // STEP 5: CONVERTING JAVA DATE FORMAT TO ORACLE DATE FORMAT
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                Date dt = sdf.parse(depart);
//                SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
//                depart = sdf1.format(dt);
//
//                //STEP 6: FILLING UP THE BLANK QUERY PARAMETERS (?)
//                ops.setString(1, trip);
//                ops.setString(2, cabin);
//                ops.setString(3, dfrom);
//                ops.setString(4, desto);
//                ops.setString(5, depart);
//                ops.setString(6, adlt);
//                ops.setString(7, chld);
//                ops.setString(8, infnt);
//
//
//                // STEP 7: EXECUTING THE QUERY
//                int x = ops.executeUpdate();
//                dispatcher = request.getRequestDispatcher("payment.jsp");
//                if (x > 0) {
//                    dispatcher = request.getRequestDispatcher("payment.jsp");
//                } else {
//                    out.println("<h2 style='color:brown'> Record could not be added...");
//                }
//                dispatcher.forward(request, response);
//
//                //STEP 8: CLOSING THE ORACLE OBJECTS
//                ops.close();
//                oconn.close();
//
//            } //STEP 9: FORMATTING THE CATCH CLAUSE
//            catch (SQLException ex) {
//                Logger.getLogger(WorkRegister.class.getName()).log(Level.SEVERE, null, ex);
//                out.println("<h2 style='color:red'> Error is : " + ex.toString() + "</h2>");
//            }
//
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//     try {
//         processRequest(request, response);
//     } catch (ParseException ex) {
//         Logger.getLogger(Air_ticket.class.getName()).log(Level.SEVERE, null, ex);
//     }
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//     try {
//         processRequest(request, response);
//     } catch (ParseException ex) {
//         Logger.getLogger(Air_ticket.class.getName()).log(Level.SEVERE, null, ex);
//     }
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
//
//    