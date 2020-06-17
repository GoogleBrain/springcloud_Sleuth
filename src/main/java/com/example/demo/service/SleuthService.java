package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SleuthService {
    public void doSomeWorkSameSpan() throws InterruptedException {
        Thread.sleep(1000L);
        System.out.println("Doing some work");
    }
}