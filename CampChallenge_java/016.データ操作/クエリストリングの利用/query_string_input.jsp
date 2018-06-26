<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>購入商品入力フォーム</title>
    </head>
    <body>
        <h2>以下の項目について入力してください<br></h2>
        
        <form action="./query_string_output.jsp" method="get">
            <p>購入した商品の総額（半角数字）※必須</p>
            <p><input type="number" name="total">円</p>
            <p>購入した商品の個数（半角数字）※必須</p>
            <p><input type="number" name="count" min="0" max="100">個</p>
            <p>商品種別をお選びください ※必須</p>
            <p>1.雑貨<input type="radio" name="type" value="1">
               2.生鮮食品<input type="radio" name="type" value="2">
               3.その他<input type="radio" name="type" value="3"></p>
            <p><input type="submit" name="btnSubmit" value="購入内容の確認画面に進む">
                <input type="reset" value="入力内容をリセットする"></p>
        </form>
    </body>
        </html>
