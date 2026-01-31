/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vinhh
 */
@WebServlet(name = "Poem", urlPatterns = {"/Poem"})
public class Poem extends HttpServlet {

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
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Welcome to  Poems</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2> Poem1 </h2>");
            out.println("<p>Tình yêu em như nhịp tim kỳ vọng<br>"
                    + "<br>"
                    + "Điểm gặp nhau trung bình động đôi đường<br>"
                    + "<br>"
                    + "Hai xu hướng hình thành trong bất chợt<br>"
                    + "<br>"
                    + "Góc nhìn em quyết định chọn một phương.<br>"
                    + "<br>"
                    + "Lúc giằng co tưởng chừng như vỡ ngực<br>"
                    + "<br>"
                    + "Khi lắc rung hồi hộp dậm chân tường<br>"
                    + "<br>"
                    + "Sự tin tưởng động viên anh giữ lệnh<br>"
                    + "<br>"
                    + "Chờ mấy phiên chịu lực em biết không.<br>"
                    + "<br>"
                    + "Phiên hôm trước bỗng nhiên lên thẳng đứng<br>"
                    + "<br>"
                    + "Mấy hôm sau nhớ mãi dáng đảo chiều<br>"
                    + "<br>"
                    + "Đường band hẹp ôm ấp vùng kháng cự<br>"
                    + "<br>"
                    + "Anh chờ thời bắt biên độ tình yêu<br>"
                    + "<br>"
                    + "Rồi phiên nữa giật mình xuyên qua đáy<br>"
                    + "<br>"
                    + "Mất ngủ đêm nghe ngóng tin tốt lành<br>"
                    + "<br>"
                    + "Đường band rộng nâng niu vùng hỗ trợ<br>"
                    + "<br>"
                    + "Mơ bên em mừng điềm tốt cho anh<br>"
                    + "<br>"
                    + "Nhìn động lượng rằng, quá mua quá bán<br>"
                    + "<br>"
                    + "Anh chọn em với, biên độ an toàn<br>"
                    + "<br>"
                    + "Cầu may mắn được cơ duyên ban tặng<br>"
                    + "<br>"
                    + "Ngài thị trường trao phước lộc cho anh<br>"
                    + "<br>"
                    + "Tình yêu em như tình yêu chứng khoán<br>"
                    + "<br>"
                    + "Sóng cao thấp tâm lý vững như kiềng<br>"
                    + "<br>"
                    + "Tình yêu em dựa nền tảng bình an<br>"
                    + "<br>"
                    + "Niềm tin lớn nơi đại ngàn hội ngộ.<br>"
                    + "</p>");

            out.println("<h1> Poem 2 </h1>");
            out.println("<p> Tết nhất năm nay chẳng có gì<br>"
                    + "<br>"
                    + "Su hào, bắp cải chấm ma-gi<br>"
                    + "<br>"
                    + "Chó nhìn ông chủ, rơi nước mắt<br>"
                    + "<br>"
                    + "Chuột nhìn bồ thóc, rụng lông mi<br>"
                    + "<br>"
                    + "Sa chân vào chứng, thôi khỏi tết<br>"
                    + "<br>"
                    + "Đào đỏ, mai vàng, ngó ti vi<br>"
                    + "<br>"
                    + "Rượu bia, nước ngọt, dòm trên báo<br>"
                    + "<br>"
                    + "Khóa cửa, trùm chăn, trốn lì xì.<br>"
                    + "</p>");
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
