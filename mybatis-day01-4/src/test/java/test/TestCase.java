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
		/* �汾��v.1
		 * ����SqlSessionFactoryBuilder
		 */
		SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
		//����SqlSessionFactoryBuilder
		SqlSessionFactory ssf=ssfb.build(TestCase.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
		//��ȡsqlSession����
		session=ssf.openSession();
		dao=session.getMapper(DeptDAO.class);
	}
	@Test
	public void test(){
		Dept dept=new Dept();
		dept.setDeptname("������");
		dept.setLoc("�ɶ�");
		int i=dao.save(dept);
		System.out.println("��������="+i);
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
		dept.setLoc("�Ĵ�");
		int i=dao.modify(dept);
		System.out.println(i);
		session.commit();
		session.close();
	}
	@Test
	public void test4(){
		int i=dao.delete(2);
		System.out.println("ɾ��="+i);
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

























