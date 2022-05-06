package d4_factory_pattern;

/**
 * @ Classname Factory_pattern
 * @ Description TODO 工厂模式
 * @ Date 2022/5/6 16:33
 * @ Created by 落尘
 */
public class Factory_pattern {
    public static Computer creatComputer(String info){
        switch (info){
            case "huawei":
                Computer computer = new huawei();
                computer.setName("华为1号");
                computer.setPrice(19999);
                return computer;
            case "mac":
                Computer computer1 = new mac();
                computer1.setName("mac Num.1");
                computer1.setPrice(9999);
                return computer1;
            default:
                return null;
        }
    }
}
