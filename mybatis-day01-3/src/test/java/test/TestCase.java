package test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import entity.Emp;
import entity.Employee;

public class TestCase {
	SqlSession session;
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
	//����sqlSession����ķ������������ݿ�
	Employee e=new Employee();
	e.setName("Giving king");
	e.setSalary(10000);
	e.setAge(22);
	int i=session.insert("test.save",e);
	//�ύ����
	session.commit();
	//�ر�session
	session.close();
}
@Test
public void test2(){
	List<Employee> employees=session.selectList("test.findAll");
	for(Employee e:employees){
		System.out.println(e);
	}
	//�ر�session
	session.close();
}
@Test
public void test3(){
	Employee e=session.selectOne("test.findById", 131);
	System.out.println(e);
	//�ر�session
	session.close();
}
@Test
public void test4(){
	Employee e=session.selectOne("test.findById", 131);
	e.setSalary(e.getSalary()*2);
	session.update("test.modify",e);
	System.out.println(e);
	//���.ɾ��.�޸ı����ύ����
	session.commit();
	//�ر�session
	session.close();
}
@Test
public void test6(){
	int i=session.delete("test.delete", 131);
	System.out.println(i);
	session.commit();
	session.close();
}
@Test
//����Map���͵Ľ��
public void test7(){
	Map data=session.selectOne("test.findById2",132);
	//oracle���ݿ�,�ֶ���Ĭ�϶��Ǵ�д
	System.out.println(data.get("name".toUpperCase()));
	session.close();
}
@Test
//����Emp
public void test8(){
	Emp emp=session.selectOne("test.findById3",132);
	System.out.println(emp);
	session.close();
}

}


































