package com.company.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public SimpleTextChat() {
    }
    
    public void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u: users) {
            if(u!=user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
