package org.cookie_operation;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CookieOperation extends HttpServlet {
    
    /*クッキーを利用して現在時刻を記録。
        また、２回目以降のアクセス時はクッキーの値を取り出し
                    前回にアクセスした時刻の情報を画面に表示。*/

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        //現在時刻を取得
            Date currentTime = new Date();
            SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        //クッキーに保存
            Cookie cookie = new Cookie("logTime", sdf.format(currentTime));
            response.addCookie(cookie); //クッキーに反映
        
        //クッキーの中身を取得
            Cookie[] logCookie = request.getCookies();

        //画面表示
            out.print("現在の時刻は、" + sdf.format(currentTime) + "です。<br>");
            if (logCookie != null) {
                for (int i = 0; i < logCookie.length; i++) {
                    if (logCookie[i].getName().equals("logTime")) {
                    out.print("前回のログインは、" + logCookie[i].getValue() + "でした。<br>");
                    break;
                   }
                }
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
