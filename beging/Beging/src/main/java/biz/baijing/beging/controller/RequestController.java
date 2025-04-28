package biz.baijing.beging.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import biz.baijing.beging.pojo.User;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class RequestController {

    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "baijing.biz is a suite .";
    }

    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> game) {
        System.out.println(game);
        return "baijing.biz is a suite .";
    }

    @RequestMapping("/arrayParam")
    public String arrayParam(String[] game) {
        System.out.println(Arrays.toString(game));
        return "baijing.biz is a suite .";
    }

    @RequestMapping("/startUser")
    public String startUser(User user) {
        System.out.println(user);
        return "baijing.biz is a suite .";
    }

/*    @RequestMapping("/startPostman")
    public String startPostman(HttpServletRequest request) {

        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");

        int age = Integer.parseInt(ageStr);

        System.out.println(name + " - " + age);

        return " This is OK !";
    }*/

    // Spring Boot 设置了形参后，会根据形参的类型自动做类型转换
    @RequestMapping("/startPostman")
    public String startPostman(@RequestParam(required = false) String name , Integer age) {

        System.out.println(name + " - " + age);

        return " This is OK !";
    }

    // 请求参数名和参数名不一致，又要接收到数据，通过 RequestPrarm 指定请求参数名
/*    @RequestMapping("/startPostman")
    public String startPostman(@RequestParam(name = "name",required = false) String username , Integer age) {

        System.out.println(username + " - " + age);

        return " This is OK !";
    }*/

}
