<%-- 
    Document   : MyNameis
    Created on : 2018/05/29, 12:58:30
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
            String secondName = "村上" ;
            String firstName = "舞華" ;
            String name = secondName + firstName ;
            
            out.print("私の名前は" + name + "です。");
        %>
        
    </body>
</html>
