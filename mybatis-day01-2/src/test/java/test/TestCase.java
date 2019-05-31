package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import entity.Dept;


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
//���Բ�������
public void test1(){
	Dept d=new Dept();
	d.setDeptName("���е�");
	d.setLoc("Ӣ��");
	int n = 0;
	for(int i=0;i<10;i++){
		d.setLoc("����"+i);
		n=session.insert("test.save", d);
		n++;
	}
	System.out.println("�ɹ����="+n);
	session.commit();
	session.close();
}
@Test
//���Բ���ȫ��
public void test2(){
	List<Dept> list=session.selectList("test.findAll");
	for(Dept e:list){
		System.out.println(e);
	}
	session.close();
}
@Test
//���Բ���ȫ��
public void test3(){
	Dept dept=session.selectOne("test.findById",5);
	System.out.println(dept);
	session.close();
}
@Test
//���Բ���ȫ��
public void test4(){
	Dept dept=session.selectOne("test.findById",5);
	dept.setDeptName("������������");
	session.update("test.modify",dept);
	System.out.println(dept);
	session.commit();
	session.close();
}
@Test
//���Բ���ȫ��
public void test5(){
	int i=session.delete("test.delete",6);
	System.out.println("ɾ��="+i);
	session.commit();
	session.close();
}

}


































