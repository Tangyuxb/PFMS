package com.team5.po;
/**
 * 用户实体，对应数据库中user_account表
 * @author Mevur
 *
 */
public class User {
	/**
	 * 用户id
	 * 对应数据库 user_id
	 */
	private String userId;
	/**
	 * 用户密码
	 * 对应数据库password
	 */
	private String password;
	/**
	 * 用户名字
	 * 对应数据库name
	 */
	private String name;
	/**
	 * 用户身份证号码
	 * 对应数据库id_card
	 */
	private String idCard;
	/**
	 * 用户地址
	 * 对应数据库address
	 */
	/**
	 * 用户电话号码
	 * 对应数据库phone
	 */
	private String phone;
	/**
	 * 用户家庭住址
	 * 对应数据库address
	 */
	private String address;
	/**
	 * 用户余额
	 * 对应数据库founds
	 */
	private Float founds;
	/**
	 * 用户状态
	 * 对应数据库user_status
	 * 0 代表用户冻结状态
	 * 1 代表用户可用状态
	 */
	private String userStatus;
	/**
	 * 用户email地址
	 * 对应数据库email
	 */
	private String email;
	/**
	 * 用户出生日期
	 * 对应数据库 birthday
	 */
	private String birthday;
	/**
	 * 用户性别
	 * 对应数据库sex
	 * 男
	 * 女
	 */
	private String sex;
	/**
	 * 用户注册时间
	 * 对应数据库create_time
	 */
	private String CreateTime;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Float getFounds() {
		return founds;
	}
	public void setFounds(Float founds) {
		this.founds = founds;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
