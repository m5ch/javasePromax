package d3_xpath;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * @ Classname demo01
 * @ Description TODO
 * @ Date 2022/5/6 15:23
 * @ Created by 落尘
 */
public class demo01 {
    /*
        1.绝对路径: /根元素/子元素/子元素
     */
    @Test
    public void parse1() throws Exception {
        //创建解析器对象
        SAXReader saxReader = new SAXReader();

        //把XML加载成Document对象
        Document document =
                saxReader.read(demo01.class.getResourceAsStream("/d3_xpath/food.xml"));

        //检索全部名称
        List<Node> nameNodes = document.selectNodes("/breakfast_menu/food/name");

        for (Node node : nameNodes) {
            Element element = (Element) node;
            System.out.println(element.getTextTrim());

        }
    }


    /*
        2.相对路径: ./子元素/子元素 (. 代当前元素)
     */

    @Test
    public void pares2() throws DocumentException {
        //创建解析器对象
        SAXReader saxReader = new SAXReader();

        //把XML加载成Document对象
        Document document =
                saxReader.read(demo01.class.getResourceAsStream("/d3_xpath/food.xml"));

        //根元素
        Element root = document.getRootElement();

        //检索全部名称
        List<Node> nameNodes = root.selectNodes("./food/name");

        for (Node node : nameNodes) {
            Element element = (Element) node;
            System.out.println(element.getTextTrim());

        }
    }

    /*
        3.全文搜索：
        //元素             在全文找这个元素
        //元素1/元素2       在全文找元素1下面的一级元素2
        //元素1//元素2      在全文找元素1下面的全部元素2

     */
    @Test
    public void parse3() throws Exception {
        //创建解析器对象
        SAXReader saxReader = new SAXReader();

        //把XML加载成Document对象
        Document document =
                saxReader.read(demo01.class.getResourceAsStream("/d3_xpath/food.xml"));

        //检索数据
//        List<Node> nameNodes = document.selectNodes("//name");
//        List<Node> nameNodes = document.selectNodes("//food/name");
        List<Node> nameNodes = document.selectNodes("//food//name");

        for (Node node : nameNodes) {
            Element element = (Element) node;
            System.out.println(element.getTextTrim());

        }
    }

    /*
        4.属性查找：
        //@属性名称             在全文检索属性对象
        //元素[@属性名称]        在全文检索包含该属性的元素对象
        //元素[@属性名称=值]      在全文检索包含该属性的元素且属性值等于该值的元素对象

     */
    @Test
    public void pares3() throws DocumentException {
        //创建解析器对象
        SAXReader saxReader = new SAXReader();

        //把XML加载成Document对象
        Document document =
                saxReader.read(demo01.class.getResourceAsStream("/d3_xpath/food.xml"));

        List<Node> nameNodes = document.selectNodes("//@id");

        for (Node node : nameNodes) {
            Attribute attr = (Attribute) node;
            System.out.println(attr.getName() + "===>" + attr.getValue());

        }


        List<Node> nodes = document.selectNodes("//name[@style]");
        for (Node node : nodes) {
            Element element = (Element) node;
            System.out.println(element.getTextTrim());
        }

        Node node = document.selectSingleNode("//name[@style=666]");
        Element element = (Element) node;
        System.out.println(element.getTextTrim());
    }

}
