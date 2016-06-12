package org.social_network.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by Админ on 07.06.2016.
 */
public class Profile {

    private  int idProfile;
    private String firstName;
    private String lastName;
    private Date birthday;
//    private LocalDate birthday;
    private String email;
    private String login;
    private String password;
    private Role role;
    private Set<Friend> friends;
    private List<Message> messages;

    public Profile() {
    }

    public Profile(int idProfile, String firstName, String lastName, Date birthday, String email, String login,
                   String password, Role role, Set<Friend> friends, List<Message> messages) {
        setIdProfile(idProfile);
        setFirstName(firstName);
        setLastName(lastName);
        setBirthday(birthday);
        setEmail(email);
        setLogin(login);
        setPassword(password);
        setRole(role);
        setFriends(friends);
        setMessages(messages);
    }

    @Override
    public String toString() {
        return "Profile{" +
                "idProfile=" + idProfile +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", friends=" + friends +
                ", messages=" + messages +
                '}';
    }

    public int getIdProfile() { return idProfile;  }
    public void setIdProfile(int idProfile) { this.idProfile = idProfile; }

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

    public Set<Friend> getFriends() { return friends; }
    public void setFriends(Set<Friend> friends) { this.friends = friends; }

    public List<Message> getMessages() { return messages; }
    public void setMessages(List<Message> messages) { this.messages = messages; }


}
