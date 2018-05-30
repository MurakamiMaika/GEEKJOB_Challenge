<%-- 
    Document   : for1
    Created on : 2018/05/30, 15:23:33
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
            long result = 1L;
            for(int i = 1; i <= 20; i++){
                  result = result * 8;
                  }
            
            out.print(result);
        %>
    </body>
</html>