package emlakcepte.dao;

import java.util.ArrayList;
import java.util.List;

import emlakcepte.model.Realty;
import emlakcepte.model.User;

public class UserDao {
	
	private static List<User> userList = new ArrayList<>();

	private static List<Realty> searchList = new ArrayList<>();

	public void createUser(User user) {	
		userList.add(user);
	}
	
	public List<User> findAllUsers() {	
		return userList;
	}

	public void addSearchToList(Realty realty){
		searchList.add(realty);
	}

	public List<Realty> getAllUserSearches(){
		return searchList;
	}

}
