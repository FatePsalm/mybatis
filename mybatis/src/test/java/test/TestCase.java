package test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import dao.EmployeeDAO;
import entity.Employee;

public class TestCase {
private SqlSession session;
private EmployeeDAO dao;	
	@Before
	public void init() {
		// 创建SqlSessionFactoryBuilder
		SqlSessionFactoryBuilder ssfb = 
				new SqlSessionFactoryBuilder();

		// 创建SqlSessionFactory
		SqlSessionFactory ssf = 
				ssfb.build(
				TestCase.class.getClassLoader()
				.getResourceAsStream(
						"SqlMapConfig.xml"));

		// 获得SqlSession对象
		session = ssf.openSession();
	    dao = session.getMapper(EmployeeDAO.class);
	}
	@Test
	public void test(){
		Employee employee=new Employee();
		employee.setSalary(12000);
		employee.setAge(22);
		employee.setName("艾丽斯");
		int i=dao.save(employee);
		System.out.println("插入数据="+i+"条");
		session.commit();
		session.close();
	}
}



















