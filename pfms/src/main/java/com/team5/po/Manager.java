package com.team5.po;
/**
 * 管理员实体对象，对应数据库manager_account
 * @author Mevur
 *
 */
public class Manager {
	/**
	 * 管理员用户id
	 * 对应数据库 manager_id
	 */
	private String managerId;
	/**
	 * 管理员密码
	 * 对应数据库password
	 */
	private String password;
	/**
	 * 管理员姓名
	 * 对应数据库name
	 */
	private String name;
	/**
	 * 管理员电话号码
	 * 对应数据库phone
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
