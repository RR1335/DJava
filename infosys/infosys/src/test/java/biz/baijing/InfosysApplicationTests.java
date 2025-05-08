package biz.baijing;

import biz.baijing.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InfosysApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testDelete() {
        int delete = empMapper.delete(16);
        System.out.println(delete);
    }

}
