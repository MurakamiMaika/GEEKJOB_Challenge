package org.TimeStamp;

import java.util.Date;

public class MakingTimeStamp {

    public static void main(String[] args){
        
    /*タイムスタンプ（ミリ秒）を生成し、
        「2016年1月1日 0時0分0秒」の情報を持つタイムスタンプを画面表示*/
    
        //1900年1月1日が基準となる。月は0から11で換算する。
        int start_year = 1900;
        int start_month = 1;
        
        Date someDay = new Date(2016 - start_year,1 - start_month,1,0,0,0);
        
        System.out.println("「" + someDay + "」");
        System.out.println("この日付のタイムスタンプは「" + someDay.getTime() + "」です。");
    }
}
