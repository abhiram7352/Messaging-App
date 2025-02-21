package com.firstspringbootapp;



// DTO (Data Transfer Object) for receiving user details in the request body
public class User {
    private String firstName;
    private String lastName;

    // Constructor
    public User() {}

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
