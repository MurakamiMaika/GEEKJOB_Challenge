<%-- 
    Document   : ArrayList
    Created on : 2018/05/30, 13:15:48
    Author     : Maikachi
--%>

<%@page import="java.util.ArrayList"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList<String> data1 = new ArrayList<String> ();
            data1.add("10");
            data1.add("100");
            data1.add("soeda");
            data1.add("hayashi");
            data1.add("-20");
            data1.add("118");
            data1.add("END");

            out.print("要素０番は「" + data1.get(0) + "」です<br>");
            out.print("要素１番は「" + data1.get(1) + "」です<br>");
            out.print("要素２番は「" + data1.get(2) + "」です<br>");
            out.print("要素３番は「" + data1.get(3) + "」です<br>");
            out.print("要素４番は「" + data1.get(4) + "」です<br>");
            out.print("要素５番は「" + data1.get(5) + "」です<br>");
            out.print("要素６番は「" + data1.get(6) + "」です<br>");
            
        %>
            
    </body>
</html>
