package org.BlackJack;

import java.util.ArrayList;
import java.util.Random;

public class Dealer extends Human {
    
    //フィールドに配列（山札）を宣言
    protected ArrayList<Integer> cards = new ArrayList ();
        

    //山札に全てのカードを追加するメソッド
    public void Dealer(){
        for(int j = 0; j < 4; j++){
            for(int i = 1; i < 13; i++){
                cards.add(i);
            }
        }
    }
    
    //山札からランダムに２枚引き、引いたカードを戻り値にするメソッド
    public ArrayList deal(){
        ArrayList dealCards = new ArrayList();
        Random rand = new Random();
        
        //２枚引くためのループ
        for(int i = 0; i < 2; i++){
            //山札配列の要素数内で乱数を取得
            int pick = rand.nextInt(cards.size());
            //取得した乱数を利用して山札からカードを引き、戻り値の配列にaddする
            dealCards.add(cards.get(pick));
            cards.remove(pick);
        }
        
        return dealCards;
    }

    //山札からランダムに１枚引き、引いたカードを戻り値にするメソッド
    public ArrayList hit(){
        ArrayList hitCard = new ArrayList();
        Random rand = new Random();
        
            int pick = rand.nextInt(cards.size());
            hitCard.add(cards.get(pick));
            cards.remove(pick);
            
        return hitCard;
    }
    
    @Override
    public int open(){
        int dealerTotal = 0;
        for( int dt : myCards ){
            if (dt <= 10){
                dealerTotal += dt;
            }else{
                dealerTotal += 10;
            }
        }
        return dealerTotal;
    }
    
    @Override
    public void setCard(ArrayList<Integer> pickCard){
        for(int i = 0; i < pickCard.size(); i++){
            myCards.add(pickCard.get(i));
        }
        
    }
    
    @Override
    public boolean checkSum(){
        if( open() < 17 ){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
