package com.firstspringbootapp;


import org.springframework.web.bind.annotation.*;

@RestController  // Marks this class as a REST API Controller
@RequestMapping("/hello")  // Base URL for all endpoints in this controller
public class HelloRestController {

    /**
     * UC3: REST Call to show Hello <name> from BridgeLabz
     * - Uses GET Request
     * - Passes the name as a path variable
     * - Example API Call: http://localhost:8080/hello/param/Mark
     *
     * @param name - User-provided name in the URL path
     * @return Greeting message with the given name
     */
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
