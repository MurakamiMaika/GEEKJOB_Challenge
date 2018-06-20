package org.BlackJack;

import java.util.ArrayList;

//User,Dealerの共通点をまとめるHumanクラス
public abstract class Human {

    //Humanクラスのフィールド
    //手札を持つ
    protected ArrayList<Integer> myCards = new ArrayList();

    //メソッドは抽象メソッドにする。（実装はUser,Dealerクラスにて）
    public abstract int open();//手札の合計を計算してreturn

    public abstract void setCard(ArrayList<Integer> dealCards);//引いたカードを手札に追加する 

    public abstract boolean checkSum(); //手札の合計値からまだ手札をひくか判断する
}
