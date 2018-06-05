package com.zsx.serviceribbon.controller;

import com.zsx.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtroller {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/test")
    public String hi(@RequestParam String name){
        return helloService.hiServiec(name);
    }
}
