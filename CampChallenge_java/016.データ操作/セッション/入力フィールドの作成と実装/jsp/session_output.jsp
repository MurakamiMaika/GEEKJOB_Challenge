<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
        // セッションを取得
            HttpSession userData = request.getSession();
            String name = (String)userData.getAttribute("name");
            String gender = (String)userData.getAttribute("gender");
            String hobby = (String)userData.getAttribute("hobby");
        %>
        <title>入力内容の確認</title>
    </head>
    <body>
        <%
            out.print("入力内容を確認してください<br>");
            
        // 受け取るパラメータの文字コード
            request.setCharacterEncoding("UTF-8");
            
        // 名前情報
            if(name != null){
                out.print("名前：" + name + "<br>");
            }else{
                out.print("お名前の記入がありませんでした<br>");
            }
        // 性別情報
            if(gender != null){
                out.print("性別：" + gender + "<br>");
            }else{
                out.print("性別の選択がありませんでした<br>");
            }
        // 趣味情報
            if(hobby != null){
                out.print("趣味：" + hobby + "<br>");
            }else{
                out.print("趣味の記入がありませんでした<br>");
            }
        %>
    <form>
        <input type="button"value="戻る" onclick="history.back()">
    </form>
    </body>
</html>
