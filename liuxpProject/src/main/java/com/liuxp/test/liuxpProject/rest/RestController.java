package com.liuxp.test.liuxpProject.rest;

import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;


@org.springframework.web.bind.annotation.RestController
@Log4j2
public class RestController {
    @RequestMapping(value =  "test")
    public String testRest(){
        log.info("test");
        return "success";
    }
}
