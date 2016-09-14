package domain;

import javax.persistence.*;

/**
 * Created by r.pogorelov on 14.09.2016.
 */
@Entity
@Table(name = "user_data")
public class User {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;
    @Column
    private String password;
    @Column
    private String email;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
