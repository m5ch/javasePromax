package d2_dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @ Classname demo01
 * @ Description TODO 使用dom4j解析XMl文件中的数据
 * @ Date 2022/5/5 20:04
 * @ Created by 落尘
 */
public class demo01 {
    @Test
    public void parseTest() throws DocumentException {
        //1. 创建一个Dom4j的解析器对象，代表了整个dom4j框架
        SAXReader saxReader = new SAXReader();

        //2. 把XML文件加载到内存中成为一个Document文档对象
//        Document document = saxReader.read("src\\d2_dom4j\\plant.xml");   //需要通过模块名区定位
        //注意：getResourceAsStream中的 / 是直接到src下寻找文件
        InputStream is = demo01.class.getResourceAsStream("/d2_dom4j/plant.xml");
        Document document = saxReader.read(is);

        //3. 获取根元素对象
        Element root = document.getRootElement();
        System.out.println(root.getName());

        //4.拿根元素下的全部子元素对象（一级）
        List<Element> elements = root.elements();
        for (Element element : elements) {
            System.out.println(element.getName());
        }
        //拿某个子元素(如有多个，默认提取第一个)
        Element ele = root.element("PLANT");
        //获取子元素文本
        System.out.println(ele.elementText("COMMON"));
        System.out.println(ele.elementTextTrim("COMMON"));  //去掉前后空格

        //根据元素获取属性值
        System.out.println(ele.attributeValue("vip"));
        Attribute attr =  ele.attribute("id");
        System.out.println(attr.getValue());

    }

}
