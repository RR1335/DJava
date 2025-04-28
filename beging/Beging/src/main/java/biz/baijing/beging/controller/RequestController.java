package biz.baijing.beging.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @RequestMapping("/startPostman")
    public String startPostman(HttpServletRequest request) {

        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");

        int age = Integer.parseInt(ageStr);

        System.out.println(name + " - " + age);

        return " This is OK !";
    }

}
