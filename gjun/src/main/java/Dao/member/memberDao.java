package Dao.member;

import java.util.List;

import Model.member;

public interface memberDao {
	//Create
	void add(member m);
	
	//Read
	List<member> queryAll();
	member queryMember(String username, String password);
	boolean queryUsername(String username);
	member queryMember(int id);
	
	//Update
	void update(member m);
	
	//Delete
	void delete(int id);
}
