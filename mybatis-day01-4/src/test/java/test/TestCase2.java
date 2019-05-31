package test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DeptDAO;
import entity.Dept;
import entity.DeptCopy;

public class TestCase2 {
	private DeptDAO dao;
	private SqlSession session;
	@Before
	public void init(){
		String config="mybatis-spring.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(config);
		dao=ac.getBean("deptDAO",DeptDAO.class);
	}
	@Test
	public void test(){
		List<Dept> list=dao.findAll();
		for(Dept d:list){
			System.out.println(d);
		}
	}
	@Test
	public void test1(){
		Dept d=dao.findById(1);
		System.out.println(d);
	}
	
}

























