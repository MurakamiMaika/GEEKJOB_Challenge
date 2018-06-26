package org.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Session1 extends HttpServlet {
    
    /*セッションを利用して現在時刻を記録。
        また、２回目以降のアクセス時はセッションの値を取り出し、
                            前回にアクセスした時刻の情報を画面に表示。*/

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        //現在時刻を取得
            Date currentTime = new Date();
            SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        //セッションを生成
            HttpSession dateLog = request.getSession();

        //画面表示
            out.print("現在の時刻は、" + sdf.format(currentTime) + "です。<br>");
            //セッションから情報を取得
            if(dateLog.getAttribute("lastTime") != null){
                String lastTime = (String)dateLog.getAttribute("lastTime");
                out.print("前回のログインは、" + lastTime + "でした。<br>");
            }else{
                out.print("前回のログイン情報はありません。");
            }
        
        //セッションに値を登録                
            dateLog.setAttribute("lastTime", sdf.format(currentTime));
        
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
