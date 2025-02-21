package com.firstspringbootapp;

import org.springframework.web.bind.annotation.*;

@RestController  // Marks this class as a REST API Controller
@RequestMapping("/hello")  // Base URL for all endpoints in this controller
public class HelloRestController {

    /**
     * UC5: REST Call to show "Hello <firstName> <lastName> from BridgeLabz"
     * - Uses PUT Request
     * - Passes first name as a path variable
     * - Passes last name as a query parameter
     * - Example API Call: http://localhost:8080/hello/put/Mark?lastName=Taylor
     *
     * @param firstName - First name from path variable
     * @param lastName - Last name from query parameter
     * @return Greeting message with full name
     */
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
