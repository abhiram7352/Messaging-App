package com.firstspringbootapp;

package com.firstspringbootapp.controller;

import org.springframework.web.bind.annotation.*;
import com.firstspringbootapp.dto.User;

@RestController  // Marks this class as a REST API Controller
@RequestMapping("/hello")  // Base URL for all endpoints in this controller
public class HelloRestController {

    /**
     * UC4: REST Call to show "Hello <firstName> <lastName> from BridgeLabz"
     * - Uses POST Request
     * - Passes first name and last name in the request body as JSON
     * - Example API Call: http://localhost:8080/hello/post
     *
     * @param user - User object containing firstName and lastName
     * @return Greeting message with the full name
     */
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
