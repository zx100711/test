package com.zx.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zx
 * @date 2023/2/27 18:16
 */

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/zx")
    public String test(){
        return "ok!";
    }
}
