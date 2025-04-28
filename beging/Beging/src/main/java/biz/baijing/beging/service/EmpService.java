package biz.baijing.beging.service;

import biz.baijing.beging.pojo.Emp;
import org.dom4j.DocumentException;

import java.util.List;

public interface EmpService {

    // 获取员工列表数据
    public List<Emp> listEmp() throws DocumentException;
}
