<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>購入確認</title>
    </head>
    <body>
    <%
            
        // 受け取るパラメータの文字コード
        request.setCharacterEncoding("UTF-8");
        
        //入力されたパラメータがnullでなければ処理を行う
        if (request.getParameter("total") != null
            && request.getParameter("count") != null
            && request.getParameter("type") != null){
                
            // 受け取ったパラメーターをint型に変換
                //商品総額
                int total = Integer.parseInt(request.getParameter("total"));
                //商品個数
                int count = Integer.parseInt(request.getParameter("count"));
                //商品種別
                int type = Integer.parseInt(request.getParameter("type"));
            
                // 商品単価
                int unitPrice = total / count;
                // 獲得ポイント
                double pt;
                if (total >= 5000 ){
                    pt = total * 0.05;
                }else if ( total >= 3000 ){
                    pt = total * 0.04;
                }else{
                    pt = 0;
                }
                int point = (int)pt; //小数点以下は切り捨てます
            
                
            // 画面表示
            out.print("購入内容を確認してください<br>");
                out.print("購入した商品の総額：" + total + "円<br>");
                out.print("購入した商品の個数：" + count + "個<br>");
                // 商品種別は場合分けして表示
                out.print("商品種別：");
                switch(type){
                    case 1:
                        out.print("雑貨<br>");
                        break;
                    case 2:
                        out.print("生鮮食品<br>");
                        break;
                    case 3:
                        out.print("その他<br>");
                        break;
                }
                out.print("商品単価：" + unitPrice + "円<br>");
                out.print("今回の獲得ポイント：" + point + "pt<br>");
        }else{
            out.print("必須項目が入力されていません。<br>");
        }
    %>
        <form action="./query_string_input.jsp" method="get">
            <input type="submit" name="btnSubmit" value="購入内容の入力画面に戻る">
        </form>
    </body>
</html>
