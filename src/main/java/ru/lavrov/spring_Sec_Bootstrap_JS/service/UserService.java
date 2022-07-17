package ru.lavrov.spring_Sec_Bootstrap_JS.service;

import org.springframework.security.core.userdetails.UserDetails;
import ru.lavrov.spring_Sec_Bootstrap_JS.model.Role;
import ru.lavrov.spring_Sec_Bootstrap_JS.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void updateUser(User user);

    List<User> findAll();

    User getUserById(Long id);

    void deleteById(User user);

    User findByUsername(String username);

    List<Role> listRoles();

    UserDetails loadUserByUsername(String username);

}
