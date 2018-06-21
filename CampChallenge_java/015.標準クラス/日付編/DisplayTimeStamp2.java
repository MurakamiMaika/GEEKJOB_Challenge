package org.TimeStamp;

import java.util.Date;

public class DisplayTimeStamp2 {
    
    public static void main(String[] args){
        
        /*2015年1月1日 0時0分0秒と
            2015年12月31日 23時59分59秒の差（ミリ秒）を表示*/
            /*someDayとotherDayの期間のミリ秒を算出するの意*/
        
        //タイムスタンプの生成
            int start_year = 1900;
            int start_month = 1;
        
            Date someDay = new Date(2015 - start_year,1 - start_month,1,0,0,0);
            Date otherDay = new Date(2015 - start_year,12 - start_month,31,23,59,59);
            
            long howLong = otherDay.getTime() - someDay.getTime();
        //ミリ秒を算出し表示
            System.out.println(howLong);
            
        /*日付時間情報を正しく入力したか確認する
         （otherDayの日に当たる情報が抜けていたため正しい結果が出せていませんでした）←修正済*/
            
        
    } 
    
}
