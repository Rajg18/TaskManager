package com.example.backendOwn;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

private final UserService userService;

public UserController(UserService userService){
    this.userService = userService;
}

@PostMapping
    public User createUser(@Valid @RequestBody User user){
        return  userService.createUser(user);
}

@GetMapping
    public List<User> getAllUser(){
    return userService.getAllUser();
    }

@GetMapping("/{id}")
    public User getUserById(@PathVariable long id){
    return userService.getUserById(id);
}

@PutMapping("/{id}")
    public User updateUser(@PathVariable Long id , @RequestBody User user){
    return userService.updateUser(id, user);
}
@DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
}
}
