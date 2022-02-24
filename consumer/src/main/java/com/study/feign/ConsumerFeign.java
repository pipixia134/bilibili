package com.study.feign;

import com.study.feign.impl.FeignServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description  降级  当服务宕机时返回给页面的异常处理
 * @Author jihaichang
 * @Date 2022/2/22 21:11
 **/
@FeignClient(name = "provider",fallbackFactory = FeignServiceFallBack.class)
public interface ConsumerFeign {

    @GetMapping("/provider/hello")
    String hello();
}
