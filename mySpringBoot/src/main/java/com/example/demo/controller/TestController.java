package com.example.demo.controller;

import com.example.demo.bean.TestBean;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/testBoot")
public class TestController {

    @RequestMapping("getTest")
    public TestBean getUser() {
        TestBean test = new TestBean();
        test.setStrTest("test");
        return test;
    }
}
