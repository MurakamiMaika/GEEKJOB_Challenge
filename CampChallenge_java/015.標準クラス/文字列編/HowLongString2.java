package org.character.string;

public class HowLongString2 {
    
    public static void main (String[] args){
        
        /*変数を宣言しメールアドレスをその値とする。
            その後、Stringクラスのメソッドを利用し、
            メールアドレスの「@」以降の文字数を画面に表示。*/
        
        String myEmailAdress = "ydk@codomo.ne.jp";
        
            //"@"の文字位置を取得
            int at = myEmailAdress.indexOf("@");
        
            //"@"以降の文字列を取得（@「以降」なので+1）
            String domain = myEmailAdress.substring(at + 1);
            
            //domainの文字数を取得し表示
            System.out.println("私のメアドの@以降の文字数は"
                                + domain.length() + "文字です。");
            
    }
    
}
