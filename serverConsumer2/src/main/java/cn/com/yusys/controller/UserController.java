package cn.com.yusys.controller;

import cn.com.yusys.feginService.UserConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserConsumer userConsumer;

    @RequestMapping("/demo")
    public String demo(){
        return userConsumer.demo();
    }

    @RequestMapping("/consumer2")
    public String demo2(){
        return userConsumer.consumer2();
    }

}
