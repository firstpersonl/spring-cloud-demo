package com.zsx.hystrix.controller;

import com.zsx.hystrix.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCtroller {
    @Autowired
    HiService hiService;

    @RequestMapping("hi")
    public String hiService(@RequestParam String name) {
        return hiService.hiService(name);
    }
}
