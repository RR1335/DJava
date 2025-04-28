package biz.baijing.beging.controller;

import biz.baijing.beging.pojo.Address;
import biz.baijing.beging.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {


    @RequestMapping("/hello")
    public Result hello() {
        String data = "hello world!!";
        System.out.println(data);
//        return new Result(1,"sucess",data);
        return Result.success(data);
    }

    @RequestMapping("/getAddress")
    public Result getAddress() {
        Address adStr = new Address();
        adStr.setSheng("江苏");
        adStr.setShi("南京");
        return Result.success(adStr);
    }

    @RequestMapping("/listAddress")
    public Result listAddress() {
        List<Address> list = new ArrayList<>();

        Address adStr = new Address();
        adStr.setSheng("广东");
        adStr.setShi("广州");

        Address adStr2 = new Address();
        adStr2.setSheng("广西");
        adStr2.setShi("南京");

        list.add(adStr);
        list.add(adStr2);

        return Result.success(list);

    }

/*
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

    }*/



}
