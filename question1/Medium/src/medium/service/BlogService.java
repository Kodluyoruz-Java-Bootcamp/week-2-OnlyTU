package medium.service;

import medium.model.Blog;
import medium.model.Draft;

import java.util.ArrayList;
import java.util.List;

public class BlogService {

    private static List<Blog> blogList =new ArrayList<>();
    private static List<Draft> draftList =new ArrayList<>();


    public void createDraft(Draft draft){
        draftList.add(draft);
    }

    public void publishBlog(Blog blog){
        blogList.add(blog);
    }
    public void deleteBlog(Blog blog){
        blogList.remove(blog);
    }
}
