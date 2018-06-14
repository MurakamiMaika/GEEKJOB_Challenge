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
public class ArgumentReturn2 extends HttpServlet {
    
    //引数で得た値と同じ値が入った配列を返すメソッド
    String[] datas(String id) {
        
        //情報を入れた配列を３人分用意
        String[] person1 = {"ginsan", "10月10日", "歌舞伎町"};
        String[] person2 = {"megane", "8月12日", "歌舞伎町"};
        String[] person3 = {"kagura", "11月3日", null};
        
        //引数で得た値と同じ値の入った配列を探して返す
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
                    
                    
                //戻り値で得た配列の中身を表示させる
                
                out.println("１人目の情報<br>");
                    for(int i = 0; i < 3; i++){
                        if(datas("ginsan")[i] != null){
                            out.println(datas("ginsan")[i]);
                        }else{
                            continue;  //nullは表示させない
                        }
                    }
                    
                out.println("<br>２人目の情報<br>");
                    for(int i = 0; i < 3; i++){
                        if(datas("megane")[i] != null){
                            out.println(datas("megane")[i]);
                        }else{
                            continue;  //nullは表示させない
                        }
                    }
                
                out.println("<br>３人目の情報<br>");
                    for(int i = 0; i < 3; i++){
                        if(datas("kagura")[i] != null){
                            out.println(datas("kagura")[i]);
                        }else{
                            continue;  //nullは表示させない
                        }
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
