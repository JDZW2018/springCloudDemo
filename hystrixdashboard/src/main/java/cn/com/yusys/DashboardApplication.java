package cn.com.yusys;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableFeignClients
@SpringCloudApplication
@EnableHystrixDashboard
public class DashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(DashboardApplication.class,args);
    }
}
