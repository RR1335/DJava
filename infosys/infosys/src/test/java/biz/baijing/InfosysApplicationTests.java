package biz.baijing;

import biz.baijing.mapper.EmpMapper;
import biz.baijing.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class InfosysApplicationTests {

    @Autowired
    private EmpMapper empMapper;

/*    @Test
    public void testDelete() {
        int delete = empMapper.delete(16);
        System.out.println(delete);
    }*/


/*    @Test
    public void testInsert() {
        // 构造员工对象
        Emp emp = new Emp();
        // 员工对象属性赋值
        emp.setUsername("ruhua");
        emp.setName("如花");
        emp.setImage("12.png");
        emp.setGender((short) 1);
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDate.of(2020, 11, 12));
        emp.setDeptId(1);
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());

        // 插入操作
        empMapper.insert(emp);

        // 输出主键ID
        System.out.println(emp.getId());

    }*/

    @Test
    public void testUpdate() {
        // 构造员工对象
        Emp emp = new Emp();
        //更新数据员工的 id
        emp.setId(15);
        // 员工对象属性赋值
        emp.setUsername("huoyanshan");
        emp.setName("火焰山");
        emp.setImage("12.png");
        emp.setGender((short) 1);
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDate.of(2023, 11, 12));
        emp.setDeptId(1);
        emp.setUpdateTime(LocalDateTime.now());

        // 插入操作
        empMapper.update(emp);

    }

    @Test
    public void testSelect() {
        Emp emp = empMapper.getEmpById(19);
        System.out.println(emp);
    }

    @Test
    public void testSelect01() {
        Emp emp = empMapper.getEmpById01(19);
        System.out.println(emp);
    }

    // 开启 驼峰命名转换后
    @Test
    public void testSelect02() {
        Emp emp = empMapper.select(15);
        System.out.println(emp);
    }


    @Test
    public void testSelectAll() {
        List<Emp> emps = empMapper.selectAll(null,(short)1,null,null);
    }

    @Test
    public void testUpdateEmp() {
        // 构造员工对象
        Emp emp = new Emp();
        //更新数据员工的 id
        emp.setId(19);
        // 员工对象属性赋值
//        emp.setUsername("wudishaohuogun");
        emp.setName("春花儿");
        emp.setUpdateTime(LocalDateTime.now());

        // 插入操作
        empMapper.updateEmp(emp);

    }

    @Test
    public void testDeleteEmp() {
        List<Integer> ids = Arrays.asList(1,2,3);
        empMapper.deleteEmp(ids);
    }


}
