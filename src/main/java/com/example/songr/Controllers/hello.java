package com.example.songr.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {
@GetMapping("/hello")
public String hello(){
    return "hello.html";
    }

}
