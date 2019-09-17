package com.example.service2.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/target")
    public String doSomething() {
        return "Response from service 2";
    }

}
