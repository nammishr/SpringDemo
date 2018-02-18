package com.app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private static Logger log = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping(method = RequestMethod.GET)
    public String sayHi()
        {
            log.info("hello");
            System.out.println("hello");
              return "hi";
        }
}
