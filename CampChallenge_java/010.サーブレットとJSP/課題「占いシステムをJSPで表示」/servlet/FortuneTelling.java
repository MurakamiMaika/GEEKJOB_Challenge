/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//DateとRandomは、占いの処理のため
import java.util.Random;
import java.util.Date;
//RequestDispatcherは、JSPを呼び出すため
import javax.servlet.RequestDispatcher;
//ResultDataは、作成したJavaBeans
import org.camp.servlet.ResultData;

/**
 *
 * @author Maikachi
 */
public class FortuneTelling extends HttpServlet {

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
        
        //ブラウザに返すWebページの文字コード
        response.setContentType("text/html;charset=UTF-8");
        
        //Webクラスを表示するためのクラスの生成
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            //運勢を管理するための配列を用意
            String luckList[] = {"大吉", "中吉", "吉", "半吉", "末小吉", "凶", "小凶", "半凶", "末凶", "凶", "大凶"};
            
            //乱数を振るためのRandomクラスのインスタンス
            Random rand = new Random();

            //配列に入れた要素数内での乱数を取得
            Integer index = rand.nextInt(luckList.length);
            
        //ページの出力を行う部分           
            //out.println("<!DOCTYPE html>");
            //out.println("<html>");
            //out.println("<head>");
            //out.println("<title>Servlet FortuneTelling</title>");            
            //out.println("</head>");
            //out.println("<body>");
            //out.println("<h5>Servlet FortuneTelling at " + request.getContextPath() + "</h5>");
 
            //取得した乱数番目の要素を表示
            //out.print("<h2>あなたの運勢は" + luckList[index] + "です！</h2>");

            //out.println("</body>");
            //out.println("</html>");
            
            
    //リクエストスコープへ結果を設定
        //ResultDataのインスタンスを生成
        ResultData data = new ResultData();
        //ResultDataクラスのsetterで運勢と日付を記録
        data.setD(new Date());
        data.setLuck(luckList[index]);
        //request.setAttributeメソッドで占い結果をリクエストスコープに登録
        request.setAttribute("DATA", data);
        //RequestDispatcherクラスを利用して、ServletクラスからJSPへ処理を移行
        String result = "/WEB-INF/jsp/FortuneTellingResult.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(result);
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
