package com.example.spring.commands.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/request")
public class RequestcONTROLLER {

    @GetMapping("/hello")
    public String getRequest() {
        return "Hello from RequestController!";
    }
        @GetMapping("/{id}")
        public int getresult (@PathVariable(value = "id") int a)
        {
            return a;
        }



}
