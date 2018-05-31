<%-- 
    Document   : for2
    Created on : 2018/05/31, 12:46:56
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
            String text = "A が 30 文字続いたもの";
            for(int i = 1; i <= 30; i++){
                text = text + "A";
            }
            out.print(text);
                //out.print("<br>")
                //int num = text.length();
                //out.print(num - 14);
        %>
    </body>
</html>
