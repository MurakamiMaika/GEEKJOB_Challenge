package org.session;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

public class Session2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
        // 受け取るパラメータの文字コード
            request.setCharacterEncoding("UTF-8");
        
            // パラメータを受け取る
            String name = request.getParameter("txtName");
            String gender = request.getParameter("gender");
            String hobby = request.getParameter("hobbyText");
        
        // セッションを生成(個人情報を含むのでセッションを利用します)
            HttpSession userData = request.getSession();
        
        // セッションに値を登録           
            userData.setAttribute("name", name);
            userData.setAttribute("gender", gender);
            userData.setAttribute("hobby", hobby);
            
            String outputJsp = "/jsp/session_output.jsp";
            RequestDispatcher rd = request.getRequestDispatcher(outputJsp);
            rd.forward(request, response);
        
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
