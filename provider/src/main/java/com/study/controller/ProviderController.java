package com.study.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author jihaichang
 * @Date 2022/2/22 20:34
 **/
@RestController
@RequiredArgsConstructor
public class ProviderController {

    @GetMapping("/hello")
    public String hello(){
        return "你好";
    }
}
