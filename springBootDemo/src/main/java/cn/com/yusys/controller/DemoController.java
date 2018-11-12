package cn.com.yusys.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController{
    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping(value = "/helloWorld",method = RequestMethod.GET)
    public String helloWorld(){
        return "hello world!";
    }
    @RequestMapping(value = "/helloWorld/{name}",method = RequestMethod.GET)
    public String helloWorld1(@PathVariable("name") String name){
        return "hello world! "+name;
    }
    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public String getApplicationName(){
        return applicationName;
    }
}
