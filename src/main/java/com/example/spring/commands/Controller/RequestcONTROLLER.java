package com.example.spring.commands.Controller;

import com.example.spring.commands.service.LogicServer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/request")
public class RequestcONTROLLER {

    private final LogicServer logicServer;

    public RequestcONTROLLER(LogicServer logicServer) {
        this.logicServer = logicServer;
    }

    @GetMapping("/hello")
    public String getRequest() {
        return "Hello from RequestController!";
    }
        @GetMapping("/{id}")
        public int getresult (@PathVariable(value = "id") int a)
        {
            return a;
        }

        @GetMapping("/add")
        public int getresult (@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
            return logicServer.addinglogic(a, b);
        }


}
