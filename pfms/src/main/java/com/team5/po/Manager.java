package com.team5.po;
/**
 * ����Աʵ����󣬶�Ӧ���ݿ�manager_account
 * @author Mevur
 *
 */
public class Manager {
	/**
	 * ����Ա�û�id
	 * ��Ӧ���ݿ� manager_id
	 */
	private String managerId;
	/**
	 * ����Ա����
	 * ��Ӧ���ݿ�password
	 */
	private String password;
	/**
	 * ����Ա����
	 * ��Ӧ���ݿ�name
	 */
	private String name;
	/**
	 * ����Ա�绰����
	 * ��Ӧ���ݿ�phone
	 */
	private String phone;
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}	
}
