<%-- 
    Document   : HashMap
    Created on : 2018/05/30, 14:30:01
    Author     : Maikachi
--%>

<%@ page import="java.util.HashMap" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HashMap<String, String> data2 = new HashMap<String, String>();
            data2.put("1", "AAA");
            data2.put("hello", "world");
            data2.put("soeda", "33");
            data2.put("20", "20");
            
            out.print("hello " + data2.get("hello"));
        %>
    </body>
</html>