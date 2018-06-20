package org.TimeStamp;

import java.util.Date;
import java.text.SimpleDateFormat;

public class WhatTimeIsIt {
    
    public static void main(String[] args){
    
        /*現在の日時を「1988年5月21日 1時23分45秒」
            といった形式で表現してください。*/
        
        //現在の日時でインスタンス作成
        Date today = new Date();
        
        //SimpleDateFormat作成し書式を指定する
        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        
        System.out.println("「" + sdf.format(today) + "」");

    }
    
}
