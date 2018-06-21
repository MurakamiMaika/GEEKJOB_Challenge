package org.character.string;

public class HowLongString1 {
    
    public static void main (String[] args){
        
        /*自分の氏名について，バイト数と文字数を取得し、それぞれの値を画面に表示。*/
        
        String myName = "ムラカミマイカ";
        
        System.out.println("私の名前のバイト数は" + myName.getBytes().length + "です。");
        System.out.println("文字数は" + myName.length() + "文字です。");
        
    }
}
