<%-- 
    Document   : switch2
    Created on : 2018/05/29, 15:36:52
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
            char chrHensu = 'あ';
            
            switch(chrHensu){
                case 'A':
                    out.print("英語");
                    break;
                case 'あ':
                    out.print("日本語");
                    break;                    
            }
            
        %>
    </body>
</html>
