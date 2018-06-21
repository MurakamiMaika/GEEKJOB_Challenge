package org.TimeStamp;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DisplayTimeStamp1 {
    
    public static void main(String[] args){
        
        /*「2016年11月4日 10時0分0秒」の情報を持つタイムスタンプ（ミリ秒）を生成し，画面に表示
            その後，さらにこの情報を「2016-11-04 10:00:00」の形式で画面に表示 */
        
        //タイムスタンプの生成と表示
            int start_year = 1900;
            int start_month = 1;
        
            Date someDay = new Date(2016 - start_year,11 - start_month,4,10,0,0);
        
            System.out.println("「" + someDay + "」");
            System.out.println("この日付のタイムスタンプは「" + someDay.getTime() + "」です。");
            
        
        //形式を指定して日付を表示
            SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
            System.out.println("形式を指定しました。");
            System.out.println("「" + sdf.format(someDay) + "」");
        
        
    }
    
}
