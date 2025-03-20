package com.atm.simulator.model;

public class User {
    private String userId; // Unique identifier for the user

    // In a real system, the PIN would be hashed for security, but this is simplified for the lab.
    private String pin;    // Secret PIN for authentication

    public User(String userId, String pin) {
        this.userId = userId;
        this.pin = pin;
    }

    public String getUserId() {
        return userId;
    }

    public boolean validatePin(String pin) {
        return this.pin.equals(pin);
    }
}