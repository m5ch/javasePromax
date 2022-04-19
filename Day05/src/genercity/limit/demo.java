package genercity.limit;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @ Classname demo
 * @ Description TODO
 * @ Date 2022/4/19 16:10
 * @ Created by 落尘
 */
public class demo {
    public static void main(String[] args) {
        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);

        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

    }

    public static void go(ArrayList<? extends Car> arr){

    }
}

class BENZ extends Car{

}

class BMW extends Car{

}

//父类
class Car{

}