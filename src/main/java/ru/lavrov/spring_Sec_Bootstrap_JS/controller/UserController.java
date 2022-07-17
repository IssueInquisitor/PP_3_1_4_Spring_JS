package ru.lavrov.spring_Sec_Bootstrap_JS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lavrov.spring_Sec_Bootstrap_JS.model.User;
import ru.lavrov.spring_Sec_Bootstrap_JS.service.UserService;

import java.security.Principal;

@RestController
@RequestMapping(value = "/api/restuser")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userpage")
    public User oneUser(Principal principal) {
        return userService.findByUsername(principal.getName());
    }
}
