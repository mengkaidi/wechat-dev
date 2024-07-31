package org.mengkaidi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main")
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "hello, main";
    }
}