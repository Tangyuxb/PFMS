package dao;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.team5.dao.UserDao;
import com.team5.po.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao;
	
	/**
	 * ����updateUser����
	 */
	//��ַ ���� �绰 ���� idcard funds user_status email birthday
	@Test
	public void testUpdateUser(){
		User user=new User();
		user.setUserId("1");
		user.setSex("Ů");
		userDao.updateUser(user);
	}
	/**
	 * ����SelectUser����
	 */
	@Test
	public void testSelectUser(){
		User user=new User();
		user.setUserId("13883485018");
		user.setPassword("123");
		User user2=userDao.selectUser(user);
		System.out.println(""+user2.getAddress());
	}
	/**
	 * ����selectUser����
	 */
	@Test
	public void testselectUser(){
        User user = new User();
        //String str="12345678901";
        //String str2 = "13883485018";
        //user.setEmail(str2);
       // user.setIdCard("3");
        user.setPhone("11111111");
       // user.setUserId(str2);
        user.setPassword("tangyu12");
    	User user2 = userDao.selectUser(user);
    	System.out.println(user2.getAddress());
    }
    @Test
    public void testgetUserById(){
    	User user =userDao.getUserById("13883485018");
    	System.out.println(user.getAddress());
    }
    @Test
    public void testupdateUser(){
    	User user = new User();
    	user.setUserId("1");
    	user.setName("����");
    	user.setPassword("�������");
    	user.setAddress("�ϴ�");
    	user.setIdCard("12345678");
    	user.setBirthday(new Timestamp(new Date().getTime()).toString());
    	user.setEmail("1149362640@qq.com");
    	userDao.updateUser(user);
    	//System.out.println(user.getAddress());
    }
	
}
