package org.BlackJack;
import java.util.ArrayList;

public class User extends Human {
    
    
    //手札の合計を計算して返す
    @Override
    public int open(){
        int userTotal = 0;
        for( int ut : myCards ){
            if (ut <= 10){
                userTotal += ut;
            }else{
                userTotal += 10;
            }
        }
        return userTotal;
    }
    
    //引いたカードを手札にsetする
    @Override
    public void setCard(ArrayList<Integer> pickCard){
        for(int i = 0; i < pickCard.size(); i++){
            myCards.add(pickCard.get(i));
        }
    }
    
    //手札の合計値からまだ手札をひくか判断する
    @Override
    public boolean checkSum(){
        if( open() < 17 ){
            return true;
        }else{
            return false;
        }
    }

    
}
