package task.task03;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * @ Classname Main
 * @ Description TODO
 * @ Date 2022/4/20 19:38
 * @ Created by 落尘
 */
public class Main {
    /**
     * 现在需要组成秋游活动，班长提供了四个景点依次是(A、B、C、D),
     * 每个学生可以选择多个景点，请统计出最终哪个景点想去的人数最多。
     * @param args
     */
    public static void main(String[] args) {
        Map<String, List<Character>> maps = new HashMap<>();

        List<Character> s1 = new ArrayList<>();
        Collections.addAll(s1,'A','B');
        maps.put("张三",s1);

        List<Character> s2 = new ArrayList<>();
        Collections.addAll(s2,'C','D');
        maps.put("李四",s2);

        List<Character> s3 = new ArrayList<>();
        Collections.addAll(s3,'A','B','C','D');
        maps.put("王五",s3);

        System.out.println(maps);

        Map<Character,Integer> infos = new HashMap<>();

        //提取所有人选择的信息
        Collection<List<Character>> values = maps.values();
        System.out.println(values);
        for (List<Character> value : values) {
            for (Character ch : value) {
                if (infos.containsKey(ch)){
                    infos.put(ch,infos.get(ch) + 1);
                }
                else
                    infos.put(ch,1);
            }
        }
        System.out.println(infos);
    }
}
