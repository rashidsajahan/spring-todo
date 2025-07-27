package com.rashid.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    String sayHello(){
        return "Hello World";
    }


}
