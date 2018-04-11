package com.ddcs.service;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ddcs.domain.User;

import jdk.nashorn.internal.ir.annotations.Ignore;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	@Autowired
	UserService us;
	@Test
	public void selectByPrimaryKeyTest() {
		User user = us.selectByPrimaryKey(1);
		assertEquals("ljx12345",user.getPassword());
		
	}
	@Ignore
	@Test
	public void insertTest() {
		User user=new User("343", "asdasd");
		int index=us.insert(user);
		assertEquals(1, index);
	}
	@Test
	public void isHasCountTest() {
	
		User user=new User("zxs", "zxs");
		int index=us.isHasCount(user);
		assertEquals(1, index);
	}

}
