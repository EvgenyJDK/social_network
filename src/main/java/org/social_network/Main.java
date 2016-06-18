package org.social_network;

import org.social_network.dao.UserDAO;
import org.social_network.models.Role;
import org.social_network.models.User;

/**
 * Created by Админ on 07.06.2016.
 */
public class Main {

    public static void main(String[] args) {


//    User user = new User(1, "aaa", "bbb", 11/11/2011, "aaa@aaa", "aaa", "aaa", Role.ADMIN, messages);

        User user = new User();
        user.setUserId(1);
        user.setFirstName("aaa");
        user.setLastName("aaa");
//        user.setBirthday();
        user.setEmail("aaa@aaa");
        user.setLogin("aaa");
        user.setPassword("aaa");
        user.setRole(Role.USER);

        System.out.println(user);

//        UserDAO userDAO = new UserDAO();
//        userDAO.createUser(user);

    }
}
