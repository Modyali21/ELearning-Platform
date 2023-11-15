package com.example.demo.Login;
import com.example.demo.Users.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    private UserServices userService;

    @PostMapping("/login")
    public String register(@RequestBody LoginRequest request){
        if(request.getRole() == 2){
            return userService.loginUser(request);
        }
        return "bad request";
    }
}
