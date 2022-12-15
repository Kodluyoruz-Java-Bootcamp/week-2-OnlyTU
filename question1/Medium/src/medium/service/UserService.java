package medium.service;

import medium.model.Blog;
import medium.model.User;
import medium.model.Tag;
import medium.repository.BlogRepo;
import medium.repository.TagRepo;
import medium.repository.UserRepo;

import java.util.List;


public class UserService {

    private UserRepo userRepo = new UserRepo();

    private TagRepo tagRepo = new TagRepo();

    public BlogRepo blogRepo = new BlogRepo();

    public void createUser(User user){
        userRepo.createUser(user);
    }

    public List<Blog> showBlogList(Blog blog){
        return blogRepo.showAll();
    }

    public List<Tag> addFavoriteTags(Tag tag){
        return tagRepo.showAll();
    }

}
