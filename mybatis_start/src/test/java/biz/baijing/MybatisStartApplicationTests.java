package biz.baijing;

import biz.baijing.mapper.UserMapper;
import biz.baijing.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisStartApplicationTests {

    @Autowired
    private UserMapper userMapper;

//    @Test
//    void contextLoads() {
//    }

    @Test
    public void testListUser() {
        List<User> userList = userMapper.listUser();
        userList.stream().forEach(System.out::println);
    }

}
