package com.team5.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team5.dao.UserDao;
import com.team5.po.User;
import com.team5.service.UserService;

/**
 * 用户接口的实现类
 * @author Tangyu
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	public User selectUser(User user) {
		return userDao.selectUser(user);
	}

	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return userDao.getUserById(userId);
	}

}
