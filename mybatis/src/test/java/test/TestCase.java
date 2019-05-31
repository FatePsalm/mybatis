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
		// ����SqlSessionFactoryBuilder
		SqlSessionFactoryBuilder ssfb = 
				new SqlSessionFactoryBuilder();

		// ����SqlSessionFactory
		SqlSessionFactory ssf = 
				ssfb.build(
				TestCase.class.getClassLoader()
				.getResourceAsStream(
						"SqlMapConfig.xml"));

		// ���SqlSession����
		session = ssf.openSession();
	    dao = session.getMapper(EmployeeDAO.class);
	}
	@Test
	public void test(){
		Employee employee=new Employee();
		employee.setSalary(12000);
		employee.setAge(22);
		employee.setName("����˹");
		int i=dao.save(employee);
		System.out.println("��������="+i+"��");
		session.commit();
		session.close();
	}
}



















