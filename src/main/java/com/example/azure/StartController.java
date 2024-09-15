package com.example.azure;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {


    @GetMapping("/test")
    public String test()
    {
        return "Hello Here";
    }
}
