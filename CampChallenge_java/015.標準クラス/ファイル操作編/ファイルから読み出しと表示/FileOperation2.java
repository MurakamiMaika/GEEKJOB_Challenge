package org.file_operation;

import java.io.*;

public class FileOperation2 {
    
    public static void main(String[] args){
        
        /*課題「ファイルの書き出しと保存」で作成した
        テキストファイルを読み込みその内容を画面に表示する*/
        
        try{
            //テキストファイルを指定しオープン
            File mf =
            new File("/Users/Maikachi/NetBeansProjects/CurriculumJava/StandardClass/src/java/org/file_operation/myNameis.txt");
            
            //ファイルの読み出し
            FileReader fr = new FileReader (mf);
            BufferedReader br = new BufferedReader (fr);
            
            //1行読み出して表示
            System.out.println(br.readLine());
            
            //開けたら閉める
            br.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
