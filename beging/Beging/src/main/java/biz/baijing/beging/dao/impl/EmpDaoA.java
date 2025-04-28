package biz.baijing.beging.dao.impl;

import biz.baijing.beging.dao.EmpDao;
import biz.baijing.beging.pojo.Emp;
import biz.baijing.beging.utils.XmlParaserUtils;
import org.dom4j.DocumentException;

import java.util.List;

public class  EmpDaoA  implements EmpDao {

    @Override
    public List<Emp> listEmp() throws DocumentException {
        // 加载解析 emp.xml 文件
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//        System.out.println(file); // 测试打印路径

        List<Emp> emps = XmlParaserUtils.parseXml(file, Emp.class);
        return emps;
    }
}
