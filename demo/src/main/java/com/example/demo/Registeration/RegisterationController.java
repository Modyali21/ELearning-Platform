package com.example.demo.Registeration;

import com.example.demo.Users.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RegisterationController {
    @Autowired
    private UserServices userService;

    @PostMapping("/register")
    public String register(@RequestBody RegistrationRequest request){
        if(request.getRole() == 2){
            return userService.registerUser(request);
        }
        return "bad request";
    }

}
