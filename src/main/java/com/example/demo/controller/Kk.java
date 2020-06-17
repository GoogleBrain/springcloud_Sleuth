package com.example.demo.controller;

import com.example.demo.service.SleuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kk {

    @Autowired
    public SleuthService sleuthService;
    @GetMapping("/k")
    public String helloSleuthSameSpan() throws InterruptedException {
        System.out.println("Same Span");
        sleuthService.doSomeWorkSameSpan();
        return "success";
    }
}
