package biz.baijing.beging.dao;

import biz.baijing.beging.pojo.Emp;
import org.dom4j.DocumentException;

import java.util.List;

public interface EmpDao {

    public List<Emp> listEmp() throws DocumentException;
}
