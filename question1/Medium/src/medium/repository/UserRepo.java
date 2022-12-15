package medium.repository;

import medium.model.Tag;
import medium.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private static List<User> userList = new ArrayList<>();

    private static List<Tag> tagList = new ArrayList<>();

    public void createUser(User user){
        userList.add(user);
    }

}

