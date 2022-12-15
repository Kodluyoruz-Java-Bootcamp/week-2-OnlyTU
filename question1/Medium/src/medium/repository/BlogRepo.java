package medium.repository;

import medium.model.Blog;

import java.util.ArrayList;
import java.util.List;

public class BlogRepo {
    private static List<Blog> blogList = new ArrayList<>();

    public List<Blog> showAll(){
        return blogList;
    }
}
