package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDAO;
import entity.Employee;

public class TestCase {
	private EmployeeDAO dao;
	@Test
	public void test(){
		String config="mybatis-spring.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(config);
		EmployeeDAO dao=ac.getBean("empDAO",EmployeeDAO.class);
		Employee e=new Employee();
		e.setName("˹άѾ");
		e.setSalary(20000);
		e.setAge(1);
		dao.save(e);
	}
	@Before
	public void init(){
		String config="mybatis-spring.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(config);
		dao=ac.getBean("empDAO",EmployeeDAO.class);
	}
	@Test
	public void test1(){
		List<Employee> list=dao.findAll();
		for(Employee e:list){
			System.out.println(e);
		}
	}
}

























