package Dao.porder;

import java.util.List;

import Model.porder;

public interface porderDao {
	
	//Create
	void add(porder p);
	
	//Read
	List<porder> queryAll();
	List<porder> querySum(int start,int end);
	porder queryPorder(int id);
	
	//Update
	void update(porder p);
	
	//Delete
	void delete(int id);

}
