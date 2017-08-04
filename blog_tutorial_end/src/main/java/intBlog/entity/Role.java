package intBlog.entity;

import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="roles")
public class Role {
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    private Set<User> users;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Transient
    public String getSimpleName(){
        return StringUtils.capitalize(this.getName().substring(5).toLowerCase());
    }

}