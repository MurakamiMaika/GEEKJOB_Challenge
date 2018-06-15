package org.ClassInJava;

//実行するクラス
public class MakingClass {
    
    public static void main(String[] args) {
        
        Human hizikata = new Human();
            hizikata.setHuman(177, 64);
            hizikata.tellYou();
    }
}
    
//Humanクラスを作成
class Human {
        
    //フィールドを宣言
    public int height;
    public int weight;
        
    //引数をフィールドに設定するためのメソッド
    public void setHuman(int h, int w){
        this.height = h;
        this.weight = w;
    }
        
    //フィールドを表示するメソッド
    public void tellYou(){
        System.out.println("身長は" + height + "、体重は" + weight + "です。");
    }
}
    
    
