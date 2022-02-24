package connect.messenger.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import connect.messenger.config.LoginCredentials;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    public void login(@RequestBody LoginCredentials credentials) {
    }
}