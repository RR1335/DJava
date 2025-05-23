package biz.baijing.beging.controller;

import biz.baijing.beging.pojo.Emp;
import biz.baijing.beging.pojo.Result;
import biz.baijing.beging.service.EmpService;
import biz.baijing.beging.service.impl.EmpServiceA;
import biz.baijing.beging.utils.XmlParaserUtils;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired    // IoC 容器将该类型的 Bean 对象赋值给变量 — 依赖注入
    private EmpService empService;

    // map 的路径 "/listEmp" 和前端页面 vue 定义的 mounted 保持一致
    @RequestMapping("/listEmp")
    public Result list() throws DocumentException {

        List<Emp> emps = empService.listEmp();

        // 响应数据

        return Result.success(emps);

        // 迁移至 dao/impl/ EmpDaoA
        // 加载解析 emp.xml 文件
/*        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file); // 测试打印路径

        List<Emp> emps = XmlParaserUtils.parseXml(file, Emp.class);

        // 迁移至 service/impl/EmpServiceA
        // 对数据进行转换处理
        emps.stream().forEach(emp -> {
            String gender = emp.getGender();
            if(gender.equals("1")){
                emp.setGender("男");
            }else if(gender.equals("2")){
                emp.setGender("女");
            }

            String job = emp.getJob();
            if(job.equals("1")){
                emp.setJob("教授");
            } else if (job.equals("2")){
                emp.setJob("讲师");
            } else if (job.equals("3")){
                emp.setJob("辅导员");
            }
        });

        // 响应数据

        return  Result.success(emps);

    }*/
    }
}
