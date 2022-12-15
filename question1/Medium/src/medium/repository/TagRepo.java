package medium.repository;

import medium.model.Tag;

import java.util.ArrayList;
import java.util.List;

public class TagRepo {
    private static List<Tag> tagList = new ArrayList<>();

    public List<Tag> showAll(){
        return tagList;
    }

    public void addFavoriteTags(Tag tag) {
        tagList.add(tag);
    }
}
