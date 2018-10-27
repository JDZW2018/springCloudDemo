package cn.com.yusys.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "hello world!";
    }
    @RequestMapping("/helloWorld/{name}")
    public String helloWorld1(@PathVariable("name") String name){
        return "hello world! "+name;
    }
    @RequestMapping("/name")
    public String getApplicationName(){
        return applicationName;
    }
}
