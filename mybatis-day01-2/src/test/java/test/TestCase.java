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
//测试插入数据
public void test1(){
	Dept d=new Dept();
	d.setDeptName("大不列颠");
	d.setLoc("英国");
	int n = 0;
	for(int i=0;i<10;i++){
		d.setLoc("美国"+i);
		n=session.insert("test.save", d);
		n++;
	}
	System.out.println("成功添加="+n);
	session.commit();
	session.close();
}
@Test
//测试查找全部
public void test2(){
	List<Dept> list=session.selectList("test.findAll");
	for(Dept e:list){
		System.out.println(e);
	}
	session.close();
}
@Test
//测试查找全部
public void test3(){
	Dept dept=session.selectOne("test.findById",5);
	System.out.println(dept);
	session.close();
}
@Test
//测试查找全部
public void test4(){
	Dept dept=session.selectOne("test.findById",5);
	dept.setDeptName("爱尔兰联合王");
	session.update("test.modify",dept);
	System.out.println(dept);
	session.commit();
	session.close();
}
@Test
//测试查找全部
public void test5(){
	int i=session.delete("test.delete",6);
	System.out.println("删除="+i);
	session.commit();
	session.close();
}

}


































