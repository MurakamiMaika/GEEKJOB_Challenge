package org.file_operation;

import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner; //入力を受け取る標準クラス「スキャナー」

public class FileOperation3 {

    public static void main(String[] args){
        
        /*単元で学習した内容を利用して，以下の内容が記載されたログファイルを作成。 
            1. 処理の内容（例：文字列の置換） ←これまでに扱っていない標準クラスを自身で調査し、その標準クラスを利用した処理を記述
            2. 処理を開始する旨と，その時刻（例：2000-01-01 12:00 開始） 
            3. 処理を終了する旨と，その時刻（例：2000-04-04 11:00 終了）*/
        
        try{
            //クラスパスを指定してファイルオープン
            File logFile =
            new File ("/Users/Maikachi/NetBeansProjects/CurriculumJava/StandardClass/src/java/org/file_operation/logtext.txt");
            
                //FileWriter作成 以下でlogを記述していく
                FileWriter fw = new FileWriter(logFile);
                    Scanner scanner = new Scanner(System.in);
                        fw.write("【Sccanerで入力を受け取り、画面表示させる処理時間のlog】");
                    
                    SimpleDateFormat sdf =
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //logを記述する形式の指定
                    
                //処理開始のlog
                    Date start = new Date();
                        fw.write("処理の開始：" + sdf.format(start));
                    
                //処理内容
                    System.out.println("入力してください＞＞");
                        String input = scanner.nextLine();
                        scanner.close();
                    System.out.println("入力された文字は" + input);
                    
                //処理終了のlog
                    Date end = new Date();
                        fw.write("処理の終了：" + sdf.format(end));

            //ファイルクローズ
            fw.close();
            
        
        
        
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
