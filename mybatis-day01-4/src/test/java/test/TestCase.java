package test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import dao.DeptDAO;
import entity.Dept;
import entity.DeptCopy;

public class TestCase {
	private DeptDAO dao;
	private SqlSession session;
	@Before
	public void init(){
		/* 版本号v.1
		 * 创建SqlSessionFactoryBuilder
		 */
		SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
		//创建SqlSessionFactoryBuilder
		SqlSessionFactory ssf=ssfb.build(TestCase.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
		//获取sqlSession对象
		session=ssf.openSession();
		dao=session.getMapper(DeptDAO.class);
	}
	@Test
	public void test(){
		Dept dept=new Dept();
		dept.setDeptname("技术部");
		dept.setLoc("成都");
		int i=dao.save(dept);
		System.out.println("插入数据="+i);
		session.commit();
		session.close();
	}
	@Test
	public void test1(){
		List<Dept> list=dao.findAll();
		for(Dept d:list){
			System.out.println(d);
		}
		session.close();
	}
	@Test
	public void test2(){
		Dept dept=dao.findById(1);
		System.out.println(dept);
		session.close();
	}
	@Test
	public void test3(){
		Dept dept=dao.findById(1);
		dept.setLoc("四川");
		int i=dao.modify(dept);
		System.out.println(i);
		session.commit();
		session.close();
	}
	@Test
	public void test4(){
		int i=dao.delete(2);
		System.out.println("删除="+i);
		session.commit();
		session.close();
	}
	@Test
	public void test5(){
		Map map=dao.findById2(1);
		System.out.println(map);
		session.close();
	}
	@Test
	public void test6(){
		DeptCopy dept=dao.findById3(1);
		System.out.println(dept);
		session.close();
	}
}

























