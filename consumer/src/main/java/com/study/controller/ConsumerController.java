package com.study.controller;

import com.study.feign.ConsumerFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author jihaichang
 * @Date 2022/2/22 21:02
 **/
@RefreshScope
@RestController
@RequiredArgsConstructor
public class ConsumerController {

    private final ConsumerFeign consumerFeign;

    @Value("${mine.name:none}")
    private String name;



    @GetMapping("/testApplication")
    public String testApplication(){
        return name;
    }

    @GetMapping("/hello")
    public String consumer(){
        return "消费者";
    }

    @GetMapping("/getProviderInfo")
    public String getProviderInfo(){
        return "消费者调用生产者 " + consumerFeign.hello();
    }
}
