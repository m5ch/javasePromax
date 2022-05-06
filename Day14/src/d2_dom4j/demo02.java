package d2_dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Classname demo02
 * @ Description TODO 解析XML文件中的数据成为一个List集合对象
 * @ Date 2022/5/6 13:49
 * @ Created by 落尘
 */
public class demo02 {
    public static void main(String[] args) throws DocumentException {
        //1.导入框架
        //2.创建SAXReader对象
        SAXReader saxReader = new SAXReader();

        //3.加载SML文件成为文档对象Document对象
        //Document document = saxReader.read("src\\d2_dom4j\\food.xml");

        Document document = saxReader.read(demo02.class.getResourceAsStream("/d2_dom4j/food.xml"));

        //4.拿到根元素
        Element root = document.getRootElement();

        //4.获取子元素
        List<Element> foodElements = root.elements("food");

        //准备一个ArrayList集合封装food信息
        List<Food> foods = new ArrayList<>();

        //遍历foodElements
        for (Element fe : foodElements) {
            Food food = new Food();
            food.setName(fe.elementTextTrim("name"));
            food.setPrice(fe.elementTextTrim("price"));
            food.setDescription(fe.elementTextTrim("description"));
            food.setCalories(Double.parseDouble(fe.elementTextTrim("calories")));
            //添加
            foods.add(food);
        }

        //遍历输出
        for (Food fd : foods) {
            System.out.println(fd);
        }

    }
}
