package com.team5.dao;

import com.team5.po.User;

public interface UserDao {
	/**
	 * 修改用户信息
	 * @param user
	 */
	public void updateUser(User user);
	/**
	 * 查询所有用户信息
	 * @param user
	 * @return
	 */
	public User selectUser(User user);
	/**
	 * 查询所有用户信息根据userId
	 * @param user
	 * @return
	 */
    public User getUserById(String userId);
}
