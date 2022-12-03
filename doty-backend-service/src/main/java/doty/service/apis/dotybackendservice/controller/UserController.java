package doty.service.apis.dotybackendservice.controller;

import doty.service.apis.dotybackendservice.model.User;
import doty.service.apis.dotybackendservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.allUsers();
    }

    @GetMapping("/users/getUser")
    public User getUserInfo(@RequestParam String userId) {
        return userService.getUserInfo(userId);
    }

    @PostMapping("/users/userInfo")
    public String userInfo(@RequestBody User user){
        User userOut  = userService.userInfo(user);
        return userOut.getUserId() + " Successfully added into database";
    }
}
