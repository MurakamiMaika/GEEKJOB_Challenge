<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>入力内容の確認</title>
    </head>
    <body>
        <%
            out.print("入力内容を確認してください<br>");
            
            // 受け取るパラメータの文字コード
            request.setCharacterEncoding("UTF-8");
            
            // 名前情報（テキストボックス）
            out.print("お名前：" + request.getParameter("txtName") + "<br>");
            // 性別情報（ラジオボタン）
            out.print("性別：" + request.getParameter("gender") + "<br>");
            // 職業情報（セレクトボックス）
            out.print("ご職業：" + request.getParameter("jobList") + "<br>");
            // 日にち情報（カレンダーUI）
            out.print("ご希望のお日にち：" + request.getParameter("calendar") + "<br>");
        %>
    </body>
</html>
