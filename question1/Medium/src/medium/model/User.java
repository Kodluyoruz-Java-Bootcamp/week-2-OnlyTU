package medium.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    int id;
    String name;
    String password;
    String mail;

    List<Blog> blogList = new ArrayList<>();
    List<Draft> draftList = new ArrayList<>();
    List<Tag> tagList = new ArrayList<>();
}
