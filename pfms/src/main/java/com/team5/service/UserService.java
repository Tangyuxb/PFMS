package com.team5.service;

import com.team5.po.User;

public interface UserService {
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
