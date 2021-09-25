package com.training.java.exercise.lesson15.project.storage;

import com.training.java.exercise.lesson15.project.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {

    List<User> userList = new ArrayList<User>();

    public void addUser(User user) {
        userList.add(user);
    }

    public User findByFirstName(String name) {
        if (name != null) {
            for (User user : userList) {
                if (name.equals(user.getFirstName())) {
                    return user;
                }

            }
        }
        throw new RuntimeException("There is no user with given username: " + name);
    }

    public boolean deleteByUserName(String name) {
        if (name != null) {
            userList.removeIf(user -> name.equals(user.getFirstName()));
            return true;
        } else return false;
    }

    public void changeUser(String name, User newUser) {
        userList.set(userList.indexOf(findByFirstName(name)), newUser);
    }

    public List<User> findAllUsers() {
        return userList;
    }

}
