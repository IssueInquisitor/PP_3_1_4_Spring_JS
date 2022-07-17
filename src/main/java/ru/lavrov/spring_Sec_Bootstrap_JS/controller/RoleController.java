package ru.lavrov.spring_Sec_Bootstrap_JS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.lavrov.spring_Sec_Bootstrap_JS.repository.RoleRepository;

@Controller
public class RoleController {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @GetMapping("/admin")
    public String userList(Model model) {
        model.addAttribute("amountOfRoles", roleRepository.findAll());
        return "admin";
    }
}