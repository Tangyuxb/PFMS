package com.team5.dao;

import com.team5.po.User;

public interface UserDao {
	/**
	 * �޸��û���Ϣ
	 * @param user
	 */
	public void updateUser(User user);
	/**
	 * ��ѯ�����û���Ϣ
	 * @param user
	 * @return
	 */
	public User selectUser(User user);
	/**
	 * ��ѯ�����û���Ϣ����userId
	 * @param user
	 * @return
	 */
    public User getUserById(String userId);
}
