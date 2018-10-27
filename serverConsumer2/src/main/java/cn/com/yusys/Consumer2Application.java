package cn.com.yusys;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class Consumer2Application {
    public static void main(String[] args) {
        SpringApplication.run(Consumer2Application.class,args);
    }
}
