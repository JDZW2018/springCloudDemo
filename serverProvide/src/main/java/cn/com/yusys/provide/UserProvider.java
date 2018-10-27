package cn.com.yusys.provide;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/userProvider")
@RestController
public class UserProvider {

        @GetMapping("/demo")
        public String demo(){
            return "demo";
        }
        @GetMapping("/demo2")
        public String demo2(){
            return "demo2";
        }
}
