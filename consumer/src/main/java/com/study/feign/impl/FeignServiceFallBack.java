package com.study.feign.impl;

import com.study.feign.ConsumerFeign;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author jihaichang 降级结果处理
 * @Date 2022/2/22 21:12
 **/
@Component
public class FeignServiceFallBack implements FallbackFactory<ConsumerFeign> {

    @Override
    public ConsumerFeign create(Throwable throwable) {
        return new ConsumerFeign() {
            @Override
            public String hello() {
                return "生产者provider服务被降级停用了";
            }
        };
    }
}
