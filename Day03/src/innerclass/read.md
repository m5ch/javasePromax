## 内部类
    内部类就是定义在一个类里面的类，里面的类可以理解成（寄生)，外部类可以理解成（宿主)。
``` 
    public class People{
    //内部类
    public class Heart{}
```

### 内部类的使用场景、作用
1. 当一个事物的内部，还有一个部分需要一个完整的结构进行描述，而这个内部的完整的结构又只为外部事物
提供服务，那么整个内部的完整结构可以选择使用内部类来设计。
2. 内部类通常可以方便访问外部类的成员，包括私有的成员。
3. 内部类提供了更好的封装性，内部类本身就可以用private protectecd等修饰
封装性可以做更多控制。

### 1.静态内部类[了解]
有static修饰，属于外部类本身。

它的特点和使用与普通类是完全一样的，类有的成分它都有，只是位置在别人里面而已。

可以直接访问外部类的静态成员，不能直接访问外部类的实例成员。

注意:开发中实际上用的还是比较少。

```
public class Outer{
Ⅱ静态成员内部类
public static class Inner{}
```
静态内部类创建对象的格式:

格式:

    外部类名.内部类名对象名=new外部类名.内部类构造器;

范例:

    Outer.Inner in = new Outer.Inner();


###成员内部类[了解]
    无static修饰，属于外部类的对象。
    JDK16之前，成员内部类中不能定义静态成员，JDK16开始也可以定义静态成员了。
```
    public class Outer {
        //成员内部类
        public class Inner {
    }
```

成员内部类创建对象的格式:
格式:

    外部类名.内部类名对象名=new外部类构造器.new内部类构造器();
范例:

    Outer.Inner in = new Outer().new Inner();

###局部内部类[比较鸡肋，了解即可]

### 匿名内部类[重点]
本质上是一个没有名字的局部内部类，定义在方法中、代码块中、等。

作用:方便创建子类对象，最终目的为了简化代码编写。

格式：
```
    new 类/抽象类名/接口类名(){
        重写方法;
    ]
```
```
   Employee a = new Employee(){
        public void work(){
            
        }
   } ;
   a.work;
```

特点：

1. 匿名内部类是一个没有名字的内部类。
2. 匿名内部类写出来就会产生一个匿名内部类的对象。
3. 匿名内部类的对象类型相当于是当前new的那个的类型的子类类型。

开发中不是我们主动去定义匿名内部类的，而是别人需要我们写或者我们可以写的时候才会使用。匿名内部类的代码可以实现代码进一步的简化（回扣主题)
