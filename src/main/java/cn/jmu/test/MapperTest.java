package cn.jmu.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.jmu.dao.UsersMapper;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class MapperTest {
	@Autowired
	UsersMapper usersMapper;

	/***
	 * 测试UserMapper
	 */
	@Test
	public void test(){
		/*
		//创建SpringIOC容器
		ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从容器中获取mapper
		ioc.getBean(UserMapper.class);
		*/
		
		System.out.println(usersMapper);
		System.out.println("finish");
	}

}
