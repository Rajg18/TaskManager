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

    public User getUserById(long id){
        return userRepo.findById(id).orElseThrow(() -> new UserNotFoundE("No User Found with id " + id));
    }

    public User updateUser(long id , User updateUser){
        User existingUser = getUserById(id);
        existingUser.setName(updateUser.getName());
        existingUser.setEmail(updateUser.getEmail());
        return userRepo.save(existingUser);
    }

    public void deleteUser(long id){
        User user = getUserById(id);
        userRepo.delete(user );
    }

}
