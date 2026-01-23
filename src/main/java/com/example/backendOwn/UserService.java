package com.example.backendOwn;

import com.example.backendOwn.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  private final UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public User createUser(User user){
        return userRepo.save(user);
    }



    public List<User> getAllUser(){
        return userRepo.findAll();
    }


}
