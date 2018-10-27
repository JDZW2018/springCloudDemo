package cn.com.yusys.feginService.failback;

import cn.com.yusys.feginService.UserConsumer;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserConsumerFallbackFactory implements FallbackFactory<UserConsumer> {
    @Override
    public UserConsumer create(Throwable throwable) {
        return new UserConsumer() {
            @Override
            public String demo() {
                return "hystrix";
            }

            @Override
            public String demo2() {
                return "hystrix2";
            }
        };
    }
}
