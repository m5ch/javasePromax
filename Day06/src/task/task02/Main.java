package task.task02;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * @ Classname Main
 * @ Description TODO
 * @ Date 2022/4/20 19:38
 * @ Created by 落尘
 */
public class Main {
    /**
     * 某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是(A、B、C、D),
     * 每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
     * @param args
     */
    public static void main(String[] args) {
//        String[] chs = {"A","B","c","D"};
        char[] chs = {'A','B','C','D'};
        StringBuilder sb = new StringBuilder();

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(chs[r.nextInt(4)]);
        }

        System.out.println(sb);

        Map<Character,Integer> lists = new HashMap<>();
        //遍历数据
        for (int i = 0; i < sb.length(); i++) {
            //提取当前字符
            char ch = sb.charAt(i);
            //判断Map集合中是否存在这个键
            if (lists.containsKey(ch)){
                //让其值+1
                lists.put(ch,lists.get(ch) + 1);
            }
            //第一次取中
            else{
                lists.put(ch,1);
            }
        }

//        Set<Map.Entry<Character, Integer>> entries = lists.entrySet();
//
//        for (Map.Entry<Character, Integer> entry : entries) {
//            char ch = entry.getKey();
//            int value = entry.getValue();
//            System.out.println(ch+"==>"+value);
//        }

        lists.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                System.out.println(key+"==>"+value);
            }
        });
    }
}
