package com.example.backendOwn;

public class UserNotFoundE extends RuntimeException{
    public UserNotFoundE(String message){
        super(message);
    }
}
