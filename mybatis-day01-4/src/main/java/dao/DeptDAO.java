package dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import entity.Dept;
import entity.DeptCopy;
@Repository("deptDAO")
public interface DeptDAO {
	public int save(Dept d);
	public List<Dept> findAll();
	public Dept findById(int i);
	public int modify(Dept d);
	public int delete(int i);
	public Map findById2(int i);
	public DeptCopy findById3(int i);
}
