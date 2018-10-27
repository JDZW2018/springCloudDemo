package cn.com.yusys.feginService;

import cn.com.yusys.feginService.failback.UserConsumerFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "serverProvide",url ="${serverProvide.url}",fallbackFactory = UserConsumerFallbackFactory.class)
public interface UserConsumer {
    @GetMapping("/userProvider/demo")
    String demo();
    @GetMapping("/userProvider/demo2")
    String consumer2();
}
