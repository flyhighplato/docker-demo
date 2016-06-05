package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by garyturovsky on 6/5/16.
 */
@RestController
public class DemoController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
