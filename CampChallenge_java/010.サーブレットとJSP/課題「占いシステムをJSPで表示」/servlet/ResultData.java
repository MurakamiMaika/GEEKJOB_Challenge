/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

//JavaBeansのルール　java.io.Serializableインターフェイスを実装
import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author Maikachi
 */
public class ResultData implements Serializable {
    
    //JavaBeansのルール　フィールドは、privateにしてカプセル化にする
    private Date d;
    private String luck;
    
    //JavaBeansのルール　publicで引数のないコンストラクタをもつ
    public ResultData(){}
    
    //JavaBeansのルール　フィールドにgetter/setterをpublicで
    public Date getD(){
        return d;
    }
    public void setD(Date d){
        this.d = d;
    }
    
    public String getLuck(){
        return luck;    
    }
    public void setLuck(String luck){
        this.luck = luck;
    }
           
}
