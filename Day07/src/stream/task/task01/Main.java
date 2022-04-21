package stream.task.task01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ Classname Main
 * @ Description TODO
 * @ Date 2022/4/21 19:03
 * @ Created by 落尘
 */
public class Main {
    public static Double sum1 = 0.0;        //部门一
    public static Double sum2 = 0.0;        //部门二
    public static Double sum3 = 0.0;        //总部

    public static void main(String[] args) {
        List<Department> d1 = new ArrayList<>();
        d1.add(new Department("张三",'男',30000,2000,400));
        d1.add(new Department("李四",'男',20000,1000,300));
        d1.add(new Department("王五",'男',40000,500,50));
        d1.add(new Department("小芳",'女',25000,5000,100));
        d1.add(new Department("强子",'男',10000,100,500));

        List<Department> d2 = new ArrayList<>();
        d2.add(new Department("孙悟空",'男',90000,2000,1000));
        d2.add(new Department("猪八戒",'男',10000,1000,200));
        d2.add(new Department("沙和尚",'男',40000,800,500));
        d2.add(new Department("唐僧",'男',2000,50,100));
        d2.add(new Department("小白龙",'男',10000,1000,500));


        //筛选出部门最高工资的员工信息，并封装成员工对象TopFarmer
        TopFormer f1 =  d1.stream().max((o1, o2) -> (o1.getSalary() + o1.getBonus()) - (o2.getSalary() + o2.getBonus()))
                .map(s -> new TopFormer(s.getName(),s.getSalary()+s.getBonus())).get();
        System.out.println(f1);

        TopFormer f2 =  d2.stream().max((o1, o2) -> (o1.getSalary() + o1.getBonus()) - (o2.getSalary() + o2.getBonus()))
        .map(s -> new TopFormer(s.getName(),s.getSalary()+s.getBonus())).get();
        System.out.println(f2);

        //统计每个部门的平均月工资，去掉最高和最低
        d1.stream().sorted((o1,o2) -> (o1.getSalary()+o1.getBonus()) - (o2.getSalary() + o2.getBonus()))
                .skip(1).limit(d1.size() - 2).forEach(s -> {
                    //求出总和
            sum1 += (s.getSalary() + s.getBonus());
        });
        BigDecimal a1 = BigDecimal.valueOf(sum1);
        BigDecimal b1 = BigDecimal.valueOf(d1.size()- 2);
        System.out.println("开发一部的平均工资：" + a1.divide(b1,2, RoundingMode.HALF_UP));

        d2.stream().sorted((o1,o2) -> (o1.getSalary()+o1.getBonus()) - (o2.getSalary() + o2.getBonus()))
                .skip(1).limit(d2.size() - 2).forEach(s -> {
                    //求出总和
            sum2 += (s.getSalary() + s.getBonus());
        });
        BigDecimal a2 = BigDecimal.valueOf(sum2);
        BigDecimal b2 = BigDecimal.valueOf(d2.size() - 2);
        System.out.println("开发二部的平均工资：" + a2.divide(b2,2,RoundingMode.HALF_UP));


        //统计整体部门平均工资，去掉最高最低
        Stream<Department> d3 = Stream.concat(d1.stream(),d2.stream());
        d3.sorted((o1,o2) -> (o1.getSalary()+o1.getBonus()) - (o2.getSalary() + o2.getBonus()))
                .skip(1).limit(d1.size()+ d2.size() - 2).forEach(s -> {
            //求出总和
            sum3 += (s.getSalary() + s.getBonus());
        });
        BigDecimal a3 = BigDecimal.valueOf(sum3);
        BigDecimal b3 = BigDecimal.valueOf(d1.size() + d2.size() - 2);
        System.out.println("开发部的平均工资：" + a3.divide(b3,2,RoundingMode.HALF_UP));
    }
}

