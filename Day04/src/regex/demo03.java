package regex;

/**
 * @ Classname demo03
 * @ Description 正则表达式在字符串方法中的应用
 * @ Date 2022/4/14 20:16
 * @ Created by 落尘
 */
public class demo03 {
    public static void main(String[] args) {
        String names = "小王sgsgasdg小赵dasga小李";
        String[] name = names.split("\\w+");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        //

        String names2 = names.replaceAll("\\w+", "  ");
        System.out.println(names2);
    }
}
