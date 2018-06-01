<%-- 
    Document   : while
    Created on : 2018/06/01, 9:58:34
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
            double n = 1000;
            
            while(n >= 100){    
                n = n/2;
            }

            out.print(n);
        %>
    </body>
</html>
