package com.firstspringbootapp;

import org.springframework.web.bind.annotation.*;

@RestController  // Marks this class as a REST API Controller
@RequestMapping("/hello")  // Base URL for all endpoints in this controller
public class HelloRestController {

    /**
     * UC2: REST Call to show Hello <name> from BridgeLabz
     * - Uses GET Request
     * - Passes the name as a query parameter
     * - Example API Call: http://localhost:8080/hello/query?name=Mark
     *
     * @param name - User-provided name in query parameter
     * @return Greeting message with the given name
     */
    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam(value = "name") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
