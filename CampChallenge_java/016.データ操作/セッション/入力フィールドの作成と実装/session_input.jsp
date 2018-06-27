<%--名前，性別，趣味の情報を送信するフォームを作成。
    セッションかクッキーを利用し、送信した値を次回アクセス時のフォームの初期値とする。--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- セッションスコープのインポート --%>
<%@page import="org.session.Session2" %>


<!DOCTYPE html>
         
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
            String name;    String gender;   String hobby;
        
// セッションを取得    
            
        // 値がnullの時は初期値を表示しない    
            if (request.getAttribute("name") != null){
                name = (String)request.getAttribute("name");
            }else{
                name = "";
            }
            
            //genderは値によりcheckedするラジオボタンを決める
            String checkedMan = "";  String checkedWoman = "";
            if (request.getAttribute("gender") != null){
                gender = (String)request.getAttribute("gender");
                if (gender.equals("男性")){
                    checkedMan = "checked";
                }else{
                    checkedWoman = "checked";
                }
            }
            
            if (request.getAttribute("hobby") != null){
                hobby = (String)request.getAttribute("hobby");
            }else{
                hobby = "";
            }
            
        %>
        
    <title>セッション課題の入力フォーム</title>
    </head>
    <body>
        <h2>情報を入力してください</h2>
        
        <form action="/DateOperation/Session2" method="post">
            
            <h3>あなたのお名前</h3>
                <input type="text" name="txtName" value="<%=name%>">
        
            <h3>性別</h3>
                男<input type="radio" name="gender" value="男性" checked="<%=checkedMan%>">
                女<input type="radio" name="gender" value="女性" checked="<%=checkedWoman%>">
        
            <h3>あなたの趣味</h3>
            <textarea name="hobbyText" rows="4" cols="40"><%=hobby%></textarea><br>
                
        <input type="submit" name="btnSubmit" value="送信する">
        <input type="reset" value="入力内容をリセットする">

        </form>
    </body>
</html>
