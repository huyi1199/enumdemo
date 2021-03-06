package com.github.xjs.ribbonboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: xjs@choicesoft.com.cn
 * @Date: 2020/8/20 15:41
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    FeignUserClient feignUserClient;

    @GetMapping("/getById")
    public String getById(){
        return feignUserClient.getById("200");
    }
}
