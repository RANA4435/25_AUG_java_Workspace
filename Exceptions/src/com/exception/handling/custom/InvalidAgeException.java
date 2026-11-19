package com.exception.handling.custom;

public class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}