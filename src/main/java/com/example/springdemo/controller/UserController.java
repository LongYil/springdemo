package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyinlong
 * @description
 * @since 2022/8/26 19:57
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @GetMapping("/login")
    private String login(@RequestParam(name = "uname") String uname){
        return uname;
    }

    @GetMapping("/test")
    private String test(){
        return "success";
    }
}
