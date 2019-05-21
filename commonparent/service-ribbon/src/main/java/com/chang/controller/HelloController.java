package com.chang.controller;

import com.chang.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author chang
 * @Date 2019/5/21
 */
@RestController
@RequestMapping("/helloController")
public class HelloController {

    @Autowired
    HelloService hello;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return hello.hiService( name );
    }
}
