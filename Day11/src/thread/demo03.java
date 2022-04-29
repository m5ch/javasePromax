package thread;

/**
 * @ Classname demo02
 * @ Description TODO 创建多线程方法二（另外的写法）：实现Runnable接口
 * @ Date 2022/4/28 14:38
 * @ Created by 落尘
 */
public class demo03 {
    /*
        优缺点：
        优点:线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强。
        缺点:编程多一层对象包装，如果线程有执行结果是不可以直接返回的。
     */
    public static void main(String[] args) {
        //1.
//        Runnable target = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("子"+i);
//                }
//            }
//        };
//
//        //把任务对象交给Thread处理
//        Thread t = new Thread(target);
//
//        //启动线程
//        t.start();
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("主："+i);
//
//        }
//
//    }

        //2.
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("子:"+i);
//                }
//            }
//        }).start();
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("主:"+i);
//
//        }

        //3.
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("子:"+i);
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主:"+i);

        }

    }
}

