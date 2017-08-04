package intBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import intBlog.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByName(String name);

}
