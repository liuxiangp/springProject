package com.liuxp.test.liuxpProject.rest;


import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@Log4j2
public class RestController {
    @RequestMapping(value =  "test")
    public String testRest(){
        System.out.println("test");
        return "success";
    }
}
