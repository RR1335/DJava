package biz.baijing.beging.controller;

import biz.baijing.beging.pojo.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello world!!");
        return "hello world!!";
    }

    @RequestMapping("/getAddress")
    public Address getAddress() {
        Address adStr = new Address();
        adStr.setSheng("江苏");
        adStr.setShi("南京");
        return adStr;
    }

    @RequestMapping("/listAddress")
    public List<Address> listAddress() {
        List<Address> list = new ArrayList<>();

        Address adStr = new Address();
        adStr.setSheng("广东");
        adStr.setShi("广州");

        Address adStr2 = new Address();
        adStr2.setSheng("广西");
        adStr2.setShi("南京");

        list.add(adStr);
        list.add(adStr2);

        return list;

    }



}
