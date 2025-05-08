package biz.baijing;

import biz.baijing.mapper.UserMapper;
import biz.baijing.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MydbApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public  void testUserList() {
        List<User> listUser = userMapper.listUser();
        listUser.forEach(System.out::println);
    }


}
