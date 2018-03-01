package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.team5.po.User;
import com.team5.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceIpml {
	
	 @Autowired
     private UserService userService;
	 @Test
	 public void testtestselectUser(){
		 User user = new User();
	     //String str="13883485018";
	     String str2 = "tangyu12";
	     user.setPhone("11111111");
	     user.setPassword(str2);
		 User user2=userService.selectUser(user);
		 System.out.println(user2.getAddress());
	 }
	    @Test
	    public void testgetUserById(){
	    	User user =userService.getUserById("13883485018");
	    	System.out.println(user.getAddress());
	    }
	    @Test
	    public void testselectUser(){
	        User user = new User();
	        //String str="12345678901";
	        String str2 = "123";
	        user.setEmail(str2);
	       // user.setIdCard("3");
	       // user.setPhone("158");
	        //user.setUserId(str);
	       // user.setPassword(str2);
	    	User user2 = userService.selectUser(user);
	    	System.out.println(user2.getAddress());
	    }
	    @Test
	    public void testUpdateUser(){
	    	User user=new User();
	    	user.setUserId("1");
	    	user.setPhone("25555");
	    	user.setSex("ÄÐ");
	    	//user.setPassword("87871gh212");
	    	userService.updateUser(user);
	    }
}
