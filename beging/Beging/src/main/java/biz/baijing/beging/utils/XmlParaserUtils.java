package biz.baijing.beging.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class XmlParaserUtils {
    public static <T> List<T> parseXml(String file, Class<T> targetClass) throws DocumentException {
        ArrayList<T> list = new ArrayList<T>();

        try{
            // 获取一个解析器对象
            SAXReader reader = new SAXReader();
            // 将XML加载到内存，返回一个文档对象
            Document document = reader.read(new File(file));
            // 获取根标签
            Element rootElement = document.getRootElement();
            // 通过根标签获取 user 标签
            List<Element> elements = rootElement.elements("emp");

            // 遍历得到每一个 user 标签
            for (Element element : elements) {
                // 获取 name 属性
//                String name = element.attributeValue("name");
                String name = element.element("name").getText();
                // 获取 age 属性
                String age = element.element("age").getText();
                // 获取 image 属性
                String image = element.element("image").getText();
                String gender = element.element("gender").getText();
                String job = element.element("job").getText();

                // 组装数据
                Constructor<T> constructor = targetClass.getDeclaredConstructor(String.class,Integer.class,String.class,String.class,String.class);
                constructor.setAccessible(true);
                T Object = constructor.newInstance(name,Integer.parseInt(age),image,gender,job);

                list.add(Object);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;

    }
}
