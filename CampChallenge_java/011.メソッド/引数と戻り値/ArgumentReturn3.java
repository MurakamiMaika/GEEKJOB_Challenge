/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ArgumentReturn;

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
public class ArgumentReturn3 extends HttpServlet {
    
    //引数で得た値と同じ値が入った配列を返すメソッド
    String[] datas(String id) {
        
        //情報を入れた配列を３人分用意(IDは"[0]"に格納)
        String[] person1 = {"ginsan", "10月10日", null};
        String[] person2 = {"megane", "8月12日", "歌舞伎町"};
        String[] person3 = {"kagura", "11月3日", "歌舞伎町"};
        
        //引数で得たIDと同じIDの入った配列を探して返す
        if (id.equals(person1[0])) {
            return person1;
        } else if (id.equals(person2[0])) {
            return person2;
        } else {
            return person3;
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ArgumentReturn1</title>");            
            out.println("</head>");
            out.println("<body>");
                    
                
                String[] allId = {"ginsan", "megane", "kagura"};
                
                //２人分の表示でループを抜けるための変数を用意
                int limit = 2;

                //allIdを順番に参照するためのループ
                for(int idNum = 0; idNum < 3; idNum++){
                    
                    //idNumを引数にもつメソッドを順番に呼び出す
                    //dataでメソッドの中身を順番に受け取る
                    for(String data: datas(allId[idNum])){
                        if(data != null){ //dataがnullでなければ表示
                            out.println(data + "<br>");
                        }else{
                            continue;
                        }
                    }
                    limit--;
                    if(limit == 0){break;} //２人分の表示でループを抜ける
                }
                
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
