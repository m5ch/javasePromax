package task.task01;

import java.util.*;

/**
 * @ Classname task01
 * @ Description TODO 模拟斗地主游戏洗牌、发牌
 * @ Date 2022/4/20 14:29
 * @ Created by 落尘
 */
public class task01 {
        //1.定义一个静态的集合存储54张牌
        public static List<Card> cards = new ArrayList<>();

        static {
            //定义点数：个数确定。内容确定，使用数组
            String[] size = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
            //定义花色：个数确定。内容确定，使用数组
            String[] color = {"♣","♦","♥","♠"};

            //组合花色和点数
            int index = 0;
            for (String s : size) {
                index++;
                for (String c : color) {
                    Card card = new Card(s,c,index);
                    cards.add(card);
                }
            }
            //大小王存入到集合中去
            Card c1 = new Card("小","🃏", ++index);
            Card c2 = new Card("大","🃏", ++index);
            Collections.addAll(cards,c1,c2);
            System.out.println("新牌:" + cards);
        }

    public static void main(String[] args) {
        //洗牌
        Collections.shuffle(cards);
        System.out.println(cards);

        //发牌（定义三个玩家）
        List<Card> A = new ArrayList<>();
        List<Card> B = new ArrayList<>();
        List<Card> C = new ArrayList<>();

        A.addAll(cards.subList(0,17));
        B.addAll(cards.subList(17,34));
        C.addAll(cards.subList(34,51));

        //地主牌
        List<Card> Threecards = new ArrayList<>();
        Threecards.addAll(cards.subList(51,54));
        System.out.println(Threecards);

        //排序
        sortCards(A);
        sortCards(B);
        sortCards(C);

        System.out.println("A:" + A);
        System.out.println("B:" + B);
        System.out.println("C:" + C);
    }

    /**
     * 排序
     * @param cards
     */
    public static void sortCards(List<Card> cards){
            Collections.sort(cards, (o1, o2) -> o2.getIndex() - o1.getIndex());
    }

}
