package Static.task_2;

import java.util.ArrayList;

/*
    斗地主游戏：
    需求：在启动游戏房间的时候，提前准备好54张牌，后续才可以直接使用这些牌数据
    分析：
    1.该房间只要一副牌
    2.定义一个静态的ArrayList集合存储54张牌对象，静态的集合只会加载一份
    3.在游戏启动前，将54张牌初始化好
    4.当系统启动的同时需要准备好54张牌数据，此时可以用静态代码块完成。

 */
public class Game {

    //1.定义一个静态集合
    public static ArrayList<String> cards = new ArrayList<String>();

    //2.运行main方法前将牌放入集合中
    static{
        //定义一个数组存储全部点数：类型确定，个数确定
        String[] size = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //定义一个数组存储全部花色：类型确定，个数确定
        String[] color = {"♥","♠","♦","♣"};
        //遍历点数
        for (int i = 0; i < size.length; i++) {
            //遍历花色
            for (int j = 0; j < color.length; j++) {
                //一张牌
                String card = size[i] + color[j];
                cards.add(card);
            }
        }
        //单独加入大小王
        cards.add("小🃏");
        cards.add("大🃏");
    }

    public static void main(String[] args) {
        System.out.println("新牌：" + cards);
    }
}
