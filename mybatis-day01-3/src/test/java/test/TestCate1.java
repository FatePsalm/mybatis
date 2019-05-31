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
		/* �汾��v.1
		 * ����SqlSessionFactoryBuilder
		 */
		SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
		//����SqlSessionFactoryBuilder
		SqlSessionFactory ssf=ssfb.build(TestCase.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
		//��ȡsqlSession����
		session=ssf.openSession();
	}
	@Test
	public void test1(){
		//���ӳ������ʵ��
		/*
		 * Mybatis�ڵײ�����ݽӿڵ�Ҫ��(��Mapperӳ����)���ɷ��Ͻӿ�Ҫ��Ķ���
		 */
		EmployeeDAO dao=session.getMapper(EmployeeDAO.class);
		Employee e=new Employee();
		e.setName("Kitty");
		e.setSalary(2000);
		e.setAge(22);
		dao.save(e);
		//��ȻҪ�ύ����
		session.commit();
		session.close();
	}
	@Test
	public void test2(){
		//���ӳ������ʵ��
		/*
		 * Mybatis�ڵײ�����ݽӿڵ�Ҫ��(��Mapperӳ����)���ɷ��Ͻӿ�Ҫ��Ķ���
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
		//���ӳ������ʵ��
		/*
		 * Mybatis�ڵײ�����ݽӿڵ�Ҫ��(��Mapperӳ����)���ɷ��Ͻӿ�Ҫ��Ķ���
		 */
		EmployeeDAO dao=session.getMapper(EmployeeDAO.class);
		Employee emp=dao.findById(133);
		System.out.println(emp);
		session.close();
	} 
	@Test
	public void test4(){
		//���ӳ������ʵ��
		/*
		 * Mybatis�ڵײ�����ݽӿڵ�Ҫ��(��Mapperӳ����)���ɷ��Ͻӿ�Ҫ��Ķ���
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
		//���ӳ������ʵ��
		/*
		 * Mybatis�ڵײ�����ݽӿڵ�Ҫ��(��Mapperӳ����)���ɷ��Ͻӿ�Ҫ��Ķ���
		 */
		EmployeeDAO dao=session.getMapper(EmployeeDAO.class);
		dao.delete(133);
		session.commit();
		session.close();
	}
}





































