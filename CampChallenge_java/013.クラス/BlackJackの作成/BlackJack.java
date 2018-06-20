package org.BlackJack;

public class BlackJack {
    public static void main(String[] args) {
        
        //ユーザーとディラーを召喚
        Dealer dealer = new Dealer();
        User user = new User();
    
        //ゲーム開始
        System.out.println("【BlackJackをスタートします！】");
        
        //ディーラーが場の準備をする
            //山札を作る
            dealer.Dealer(); 
        
            //最初の２枚をユーザーとディーラーにそれぞれ配る
            System.out.println("ディーラー「ユーザーにカードを２枚配ります。」");
                user.setCard(dealer.deal());
                user.open();
            System.out.println("ディーラー「ディーラーもカードを２枚引きます。」");
                dealer.setCard(dealer.deal());
                dealer.open();
        
        //ユーザーの手札を開示
        System.out.println("ユーザーの手札：" + user.myCards );
        System.out.println("ユーザーの手札の合計：" + user.open());
    
        //ディーラーのアップカードを表示
        System.out.println("ディーラーのアップカード：" + dealer.myCards.get(0));
        
        
        //ユーザーのターン
            //手札を吟味して必要があればヒットする
            while(user.checkSum() == true){
                
                System.out.println("ディーラー「ヒットしますか？」");
                System.out.println("ユーザー「ヒットします。」");
                user.setCard(dealer.hit());
                //ユーザーの手札を開示
                System.out.println("ユーザーの手札：" + user.myCards );
                System.out.println("ユーザーの手札の合計：" + user.open());
            
            }
        
            //ユーザーbustならゲーム終了
            if(user.checkSum() != true && user.open() > 21){
                System.out.println("ユーザーはbustしました！！ディーラーの勝利です！");
                System.out.println("ユーザー「どんげばび〜〜〜！！！」");
                System.out.println("また遊んでね☆");
                System.exit(0); //プログラム終了
            }else{ //ゲーム続行の場合は下へ
                System.out.println("ディーラー「ヒットしますか？」");
                System.out.println("ユーザー「スタンドでおなしゃす。」");
            }
        
        
        //ディーラーのターン
            //ホールカードを開示する
            System.out.println("ディーラー「ホールカードをオープンします。」");
            System.out.println("ディーラーのホールカード：" + dealer.myCards.get(1));
        
            //必要があればヒットする
            while(dealer.checkSum() == true){
                System.out.println("ディーラー：ヒットします。");
                dealer.setCard(dealer.hit());
                System.out.println("ディーラーの手札：" + dealer.myCards );
            }
            
        //勝敗を決定
            //両者の手札の開示
            System.out.println("ユーザーの結果：" + user.open() 
                             + "  ディーラーの結果：" + dealer.open());
            
            //ユーザーが勝利or負け、引き分けを場合分けで表示
            if(dealer.open() > 21 || dealer.open() < user.open()){
                System.out.println("☆☆おめでとうございます！ユーザーの勝ちです！！☆☆");
            }else if(user.open() == dealer.open()){
                System.out.println("引き分けでした！");
            }else{
                System.out.println("ユーザーの負けです。。");
            }
            
        //ゲーム終了    
        System.out.println("【これでBlackJackを終わります。また遊んでね！】");
        System.exit(0); //プログラムから離脱
        
    }
}
