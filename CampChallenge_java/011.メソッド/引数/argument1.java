/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.argument;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Maikachi
 */
public class argument1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //第一引数で得た値が偶数か奇数かを条件判断し，そのどちらであるかを画面に表示するメソッドを作成
    //引数はメソッド外から渡す
    void evenOrOdd (int num, PrintWriter pw){
        
        //偶数であるかの真偽をとる
        boolean isEven;
        isEven = (num % 2 == 0);
        
        //結果を出力するための構造
        if (isEven == true){
            pw.print( num + "は偶数です。");
        }else{
            pw.print( num + "は奇数です。");
        }            
    }
    
    //引数が渡されなかった場合のデフォルト値の設定
    void evenOrOdd (PrintWriter pw){    
        evenOrOdd(0, pw);
            pw.print("引数が渡されていません。デフォルト値「０」にて実行しました。");
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet argument1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet argument1 at " + request.getContextPath() + "</h1>");
            
                //引数を渡して結果を出力する
                out.println("<h2>");
                    evenOrOdd(99, out);
                out.println("</h2>");
            
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
