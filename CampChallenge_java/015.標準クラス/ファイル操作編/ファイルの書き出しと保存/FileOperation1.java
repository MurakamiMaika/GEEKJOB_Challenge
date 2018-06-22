package org.file_operation;

import java.io.*;

public class FileOperation1 {
    
    public static void main(String[] args){
        
        /*Fileクラスを使用し、自己紹介テキストファイルを作成し保存する*/
        
        try {
            //ファイルオープン
            File fp = 
            new File("/Users/Maikachi/NetBeansProjects/CurriculumJava/StandardClass/src/java/org/file_operation/myNameis.txt");
        
            /*↑絶対パスを使用して、
            指定したディレクトリに指定したファイルを生成している*/
            
            
            //ファイルへの記述
            FileWriter fw = new FileWriter(fp); //FileWriter作成
                fw.write("私の名前は舞華です。");
                fw.write("一人称はわしです。");
                fw.write("ニャンちゅうが好きです。");
            
            //ファイルクローズ
            fw.close();
        
        
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    } 
    
}
