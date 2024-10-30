package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.JwtTokenUtil;

@RestController
public class UserController {
    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @GetMapping("/getKey")
    public String test (){
        String key = jwtTokenUtil.generateSecretKey().toString();
        String key2 = jwtTokenUtil.generateSecretKey().toString();

        return key;
    }
}
