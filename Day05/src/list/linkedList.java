package list;

import java.util.LinkedList;

/**
 * @ Classname LinkedList
 * @ Description TODO
 * @ Date 2022/4/18 20:12
 * @ Created by 落尘
 */
public class linkedList {
    public static void main(String[] args) {
        /*
            LinkedList可以完成队列结构和栈结构（双向链表）
         */
        /* 栈 */
        LinkedList<String> stack = new LinkedList<>();
        //入栈，压栈
        stack.addFirst("第1");
        stack.addFirst("第2");
        stack.push("第3");
        stack.push("第4");
        System.out.println(stack);

        //出栈，弹栈
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.pop());
        System.out.println(stack);

        /*
            队列
         */
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);

        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

    }
}
