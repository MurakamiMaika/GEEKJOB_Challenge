package org.ClassInJava;

//実行クラス
public class ExtendsClass{
    public static void main(String[] args) {
                    
        ClearField madao = new ClearField();
            madao.setHuman(179, 67);
            madao.tellYou();
        
        System.out.println("フィールドをクリアします。");
            madao.clearField();
            madao.tellYou();
    }
}

//同packageのHumanクラスを継承する
class ClearField extends Human {
    
    //フィールドの値をクリアするメソッド
    public void clearField(){
        this.height = 0;
        this.weight = 0;
    }
    
}