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
public class argument2 extends HttpServlet {
    
    //引数を４つもつユーザー定義メソッドを作成
    void multiplication (int x, int y, boolean bool, PrintWriter pw){
        
        //真偽値trueの際の処理
        int product = x * y;
        if (bool == true){
            int square;
            square = product * product;
            pw.print("真偽値がtrueだったので、結果を表示します。結果は" + square + "です。");
        }else{
            pw.print("真偽値がtureではありませんでした。");
        }
    }
        
    //上記メソッドのデフォルト値を設定
    void multiplication (PrintWriter pw){
        multiplication (5, 0, false, pw);
            pw.print("デフォルト値にて処理を行なっています。");
    
    }
    
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
            out.println("<title>Servlet argument2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet argument2 at " + request.getContextPath() + "</h1>");
                
                out.println("<h2>");
                
                out.println("１つめのメソッドに於いて引数を渡しました。"); out.print("<br>");
                    multiplication(2, 3, true, out); out.print("<br>");
                out.println("２つめのメソッドでデフォルト値の設定をしています。その確認です。"); out.print("<br>");
                    multiplication(out); out.print("<br>");
                    
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
