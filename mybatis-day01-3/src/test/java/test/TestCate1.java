package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import dao.EmployeeDAO;
import entity.Employee;

public class TestCate1 {
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
	}
	@Test
	public void test1(){
		//获得映射器的实现
		/*
		 * Mybatis在底层会依据接口的要求(即Mapper映射器)生成符合接口要求的对象
		 */
		EmployeeDAO dao=session.getMapper(EmployeeDAO.class);
		Employee e=new Employee();
		e.setName("Kitty");
		e.setSalary(2000);
		e.setAge(22);
		dao.save(e);
		//仍然要提交事务
		session.commit();
		session.close();
	}
	@Test
	public void test2(){
		//获得映射器的实现
		/*
		 * Mybatis在底层会依据接口的要求(即Mapper映射器)生成符合接口要求的对象
		 */
		EmployeeDAO dao=session.getMapper(EmployeeDAO.class);
		List<Employee> employees=dao.findAll();
		for(Employee e:employees){
			System.out.println(e);
		}
		session.close();
	}
	@Test
	public void test3(){
		//获得映射器的实现
		/*
		 * Mybatis在底层会依据接口的要求(即Mapper映射器)生成符合接口要求的对象
		 */
		EmployeeDAO dao=session.getMapper(EmployeeDAO.class);
		Employee emp=dao.findById(133);
		System.out.println(emp);
		session.close();
	} 
	@Test
	public void test4(){
		//获得映射器的实现
		/*
		 * Mybatis在底层会依据接口的要求(即Mapper映射器)生成符合接口要求的对象
		 */
		EmployeeDAO dao=session.getMapper(EmployeeDAO.class);
		Employee emp=dao.findById(133);
		emp.setAge(emp.getAge()*2);
		dao.modify(emp);
		System.out.println(emp);
		session.commit();
		session.close();
	}
	@Test
	public void test5(){
		//获得映射器的实现
		/*
		 * Mybatis在底层会依据接口的要求(即Mapper映射器)生成符合接口要求的对象
		 */
		EmployeeDAO dao=session.getMapper(EmployeeDAO.class);
		dao.delete(133);
		session.commit();
		session.close();
	}
}





































