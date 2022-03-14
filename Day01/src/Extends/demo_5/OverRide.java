package Extends.demo_5;

/*
    理解方法重写
    方法重写的应用场景
    当子类需要父类的功能，但父类的该功能不完全满足自己的需求时。
    子类可以重写父类中的方法。
 */

/*
    方法重写注意事项和要求
    1.重写方法的名称、形参列表必须与被重写方法的名称和参数列表一致。
    2.私有方法不能被重写。
    3.子类重写父类方法时，访问权限必须大于或者等于父类（暂时了解∶缺省<protected < public)
    4.子类不能重写父类的静态方法，如果重写会报错的。
 */
public class OverRide {
    public static void main(String[] args) {
        New phone = new New();
        phone.call();
    }
}

//父类
class Old{
    public void call(){
        System.out.println("我可以打电话");
    }
}

//子类
class New extends Old{
    //方法重写
    @Override
    /*
        1.@Override是放在重写后的方法上，作为重写是否正确的校验注解。
        2.加上该注解后如果重写错误，编译阶段会出现错误提示。
        3.建议重写方法都加@Override注解，代码安全，优雅!
     */
    public void call(){
        super.call();       //先用父类的基本功能
        System.out.println("我可以视频");
    }
}
