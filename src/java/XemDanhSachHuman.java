/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.ConnectDB;

/**
 *
 * @author vinhh
 */
public class XemDanhSachHuman extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            response.setContentType("text/html;charset=UTF-8");
            //------1.1 Tạo connection
            Connection kn = new ConnectDB().getConnection();
            //------1.2 Tạo đối tượng cần ra lệnh [Statement] & Gán câu lệnh SQL cần dùng cho nó 
            Statement rl = kn.createStatement();
            String sqlString = "SELECT humanID, humanName, dob , gender, userHuman, passHuman"
                    + " FROM human";
            //--------1.3 Thi hafnh [executeQuery] và nhận về kết quả [ResultSet]------
            ResultSet tkq = rl.executeQuery(sqlString);
            //--------1.4 lặp và xử lí [Đoc] dựa trên tập kết quả [ResultSet]--------
            String htmlTable = "<table>";
            while (tkq.next()) {
                int id = tkq.getInt(1);
                String name = tkq.getString(2);
                Date dob = tkq.getDate(3);
                boolean gender = tkq.getBoolean(4);
                String user = tkq.getString(5);
                String pass = tkq.getString(6);
                htmlTable += "<tr>"
                        + "<td>" + id + "</td>"
                        + "<td>" + name + "</td>"
                        + "<td>" + dob + "</td>"
                        + "<td>" + (gender ? "Male" : "Female") + "</td>"
                        + "<td>" + user + "</td>"
                        + "<td>" + pass + "</td>"
                        + "</tr>";

            }
            htmlTable += "</table>";
            //-----------1.5 Đóng kết nối để giải phóng tài nguyên 
            kn.close();
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet XemDanhSachHuman</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet XemDanhSachHuman at " + request.getContextPath() + "</h1>");
                out.println(htmlTable);
                out.println("</body>");
                out.println("</html>");
            }

        } catch (SQLException ex) {
            Logger.getLogger(XemDanhSachHuman.class.getName()).log(Level.SEVERE, null, ex);
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
