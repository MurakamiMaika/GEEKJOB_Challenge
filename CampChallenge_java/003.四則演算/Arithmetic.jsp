<%-- 
    Document   : Arithmetic
    Created on : 2018/05/29, 13:37:44
    Author     : Maikachi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

        final int BASE = 100;
        int num = 30;

        int tasu = BASE + num;
        int hiku = BASE - num;
        int kake = BASE * num;
        int wari = BASE / num;
        int amari = BASE % num;
        
        out.print(tasu + "<br>");
        out.print(hiku + "<br>");
        out.print(kake + "<br>");
        out.print(wari + "<br>");
        out.print(amari + "<br>");
        
%>
        
    </body>
</html>
