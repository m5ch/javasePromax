package innerclass.demo3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//目标：通过GUI编程，理解匿名内部类的真是使用场景
public class Task {
    public static void main(String[] args) {
        //1.创建窗口
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);

        //2.创建一个按钮对象
        JButton btn = new JButton("我喜欢你！");

        /**
         * 注意：讲解匿名内部类的使用
         */
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win,"我也喜欢你！");
//            }
//        });

        btn.addActionListener(e -> JOptionPane.showMessageDialog(win,"I LOVE YOU！"));

        //3.把窗口对象添加到桌布上展示
        panel.add(btn);

        //4.展示窗口
        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);


    }
}
