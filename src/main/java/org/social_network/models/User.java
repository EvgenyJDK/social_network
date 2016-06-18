package org.social_network.models;

import java.util.Date;
import java.util.List;

/**
 * Created by Админ on 07.06.2016.
 */
public class User {

    private  int userId;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String email;
    private String login;
    private String password;
    private Role role;
    private List<Message> messages;


    public User() {
    }

    public User(int userId, String firstName, String lastName, Date birthday, String email, String login,
                String password, Role role, List<Message> messages)      {
        setUserId(userId);
        setFirstName(firstName);
        setLastName(lastName);
        setBirthday(birthday);
        setEmail(email);
        setLogin(login);
        setPassword(password);
        setRole(role);
        setMessages(messages);
    }


    public int getUserId() { return userId;  }
    public void setUserId(int userId) { this.userId = userId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public Date getBirthday() { return birthday; }
    public void setBirthday(Date birthday) { this.birthday = birthday; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public List<Message> getMessages() { return messages; }
    public void setMessages(List<Message> messages) { this.messages = messages; }



    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", messages=" + messages +
    }



}
