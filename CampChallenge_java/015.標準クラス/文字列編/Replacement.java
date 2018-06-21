package org.character.string;

public class Replacement {
    
    public static void main (String[] args){
        
        /*文字列型の変数を宣言し、
        "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます" をその値する。 
        宣言した変数について、「I」を「い」に，「U」を「う」に置換した文字列を表示。*/
        
        String replacedYet = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        String replaced = replacedYet.replace("U", "う").replace("I", "い");
        System.out.println(replaced);
        
    }
    
}
