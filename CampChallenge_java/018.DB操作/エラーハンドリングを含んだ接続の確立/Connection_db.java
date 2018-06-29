package org.curriculum;

import java.sql.*;

/*JDBCを利用して、Challenge_db データベースへの接続う。
                このとき，エラーハンドリングについても記述する。*/

public class Connection_db {
    
    public static void main (String[] args){
        
        //DriverManagerによる接続（getConnectionメソッドを使用）
        Connection db_con = null; //コネクション変数を用意  

        try { //tryの中には例外が発生するかもしれない処理を記述
            
            /*今回はDBへの接続処理を記述します*/
            
            //Class.forNameメソッドでDBドライバのインスタンスを生成する
            /*DriverManagerクラス（ドライバを管理するクラス）に
            DBドライバクラス自身を登録しに行くという処理をしてもらうのが目的。*/
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            /*接続文字列とは【jdbc : データベースの種類 :// 接続先 : ポート番号 / データベース名 】*/
            String url = "jdbc:mysql://localhost:8889/Challenge_db"; //接続文字列
            String user = "murakamim"; //アカウント名
            String password = "kame"; //パスワード

            //Connection 変数 = DriverManager.getConnection(接続文字列, アカウント名, パスワード);
            db_con = DriverManager.getConnection(url, user, password);
            db_con.close();
            
        }catch (SQLException e_sql) { //catchの中には例外が発生した際に行う処理を記述
            /* catch文の使い方
            ーーーcatch (クラス型 引数) とする
                「SqlException」とは、SQL Server が警告またはエラーを返したときにスローされるクラス名。
                このクラスは継承できない。*/
            
            //今回は、例外が発生した際にエラー文を表示させます
            /*toStringメソッドは現在発生している例外のエラー文を返してくれるメソッド*/
            System.out.println("接続時にエラーが発生しました：" + e_sql.toString());
        
        } catch (Exception e) {
            System.out.println("接続時にエラーが発生しました：" + e.toString());
            
        } finally { //finallyの中には例外の有無に関わらず実施する処理を記述
            
            /*今回は、もし例外が発生したらDB接続を切断する処理を記述します*/
            if (db_con != null) {
                try {
                    db_con.close();
                } catch (Exception e_con) {
                    System.out.println(e_con.getMessage());
                }
            }
        }
    }
    
}
