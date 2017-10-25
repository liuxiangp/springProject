package com.liuxp.test.liuxpProject.rest;


import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @RequestMapping(value =  "test")
    public String testRest(){
        System.out.println("test");
        return "success";
    }
}
