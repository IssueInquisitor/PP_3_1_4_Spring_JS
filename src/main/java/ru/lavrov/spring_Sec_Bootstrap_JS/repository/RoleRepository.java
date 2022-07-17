package ru.lavrov.spring_Sec_Bootstrap_JS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lavrov.spring_Sec_Bootstrap_JS.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findById(long id);
}
