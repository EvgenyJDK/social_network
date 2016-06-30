package org.social_network.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

/**
 * Created by Админ on 18.06.2016.
 */

@Entity
@Table(name = "user", schema = "socials_db")
public class User {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private int userId;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ROLE")
    private String role;

    @OneToMany (mappedBy = "sender")
    private Set<Message> sendersMessages;

    @OneToMany (mappedBy = "receiver")
    private Set<Message> receiversMessages;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        if (userId != that.userId) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        return result;
    }



    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public Set<Message> getSendersMessages() { return sendersMessages; }
    public void setSendersMessages(Set<Message> messages) { this.sendersMessages = messages; }

    public Set<Message> getReceiversMessages() { return receiversMessages; }
    public void setReceiversMessages(Set<Message> messages2) { this.receiversMessages = messages2; }


}
