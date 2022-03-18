package api.object.equals;

import java.util.Objects;

public class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 比较者:     s1 --> this
     * 被比较者:   s2 --> o
     */
//    @Override
//    public boolean equals(Object o){
//        //判断是否是同一个类
//        if (o instanceof Teacher s2){
//            //判断内容的是否一样
//            return this.name.equals(s2.name) || this.age == s2.age;
//        }
//        else
//            return false;
//    }


    /**
     * 比较者:  s1 --> this
     * 被比较者:  s2 --> o
     */
    @Override
    public boolean equals(Object o) {
        //判断是否是同一个对象
        if (this == o) return true;
        //判断s2是否是null  || 判断类型是否相同
        if (o == null || this.getClass() != o.getClass()) return false;
        //比较内容
        Teacher teacher = (Teacher) o;
        return age == teacher.age && Objects.equals(name, teacher.name);
    }

}
