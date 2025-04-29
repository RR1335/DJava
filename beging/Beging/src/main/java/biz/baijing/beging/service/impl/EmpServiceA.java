package biz.baijing.beging.service.impl;

import biz.baijing.beging.dao.EmpDao;
import biz.baijing.beging.dao.impl.EmpDaoA;
import biz.baijing.beging.pojo.Emp;
import biz.baijing.beging.service.EmpService;
import jakarta.annotation.Resource;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
@Resource(type = EmpDaoA.class)
public class EmpServiceA implements EmpService {

    @Autowired
    private EmpDao empDao ;

    @Override
    public List<Emp> listEmp() throws DocumentException {
        // 获取 dao 层数据
        List<Emp> emps = empDao.listEmp();

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
        return emps;
    }
}
