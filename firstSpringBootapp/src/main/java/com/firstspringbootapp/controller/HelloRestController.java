package com.firstspringbootapp.controller;

import org.springframework.web.bind.annotation.*;
//import com.firstspringbootapp.dto.User;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // ✅ UC1: Default Greeting
    // 🌐 GET Request -> curl localhost:8080/hello -w "\n"
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz!!";
    }

    // ✅ UC2: Query Parameter
    // 🌐 GET Request -> curl "localhost:8080/hello/query?name=Mark" -w "\n"
    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam(value = "name") String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // ✅ UC3: Path Variable
    // 🌐 GET Request -> curl "localhost:8080/hello/param/Mark" -w "\n"
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // ✅ UC4: POST Request with JSON Body
    // 🌐 POST Request -> curl -X POST -H "Content-Type: application/json" -d '{"firstName": "Mark","lastName": "Taylor"}' "http://localhost:8080/hello/post" -w "\n"
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    // ✅ UC5: PUT Request with Path Variable & Query Parameter
    // 🌐 PUT Request -> curl -X PUT "localhost:8080/hello/put/Mark/?lastName=Taylor" -w "\n"
    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
