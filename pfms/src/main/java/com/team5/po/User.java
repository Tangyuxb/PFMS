package com.team5.po;
/**
 * �û�ʵ�壬��Ӧ���ݿ���user_account��
 * @author Mevur
 *
 */
public class User {
	/**
	 * �û�id
	 * ��Ӧ���ݿ� user_id
	 */
	private String userId;
	/**
	 * �û�����
	 * ��Ӧ���ݿ�password
	 */
	private String password;
	/**
	 * �û�����
	 * ��Ӧ���ݿ�name
	 */
	private String name;
	/**
	 * �û����֤����
	 * ��Ӧ���ݿ�id_card
	 */
	private String idCard;
	/**
	 * �û���ַ
	 * ��Ӧ���ݿ�address
	 */
	/**
	 * �û��绰����
	 * ��Ӧ���ݿ�phone
	 */
	private String phone;
	/**
	 * �û���ͥסַ
	 * ��Ӧ���ݿ�address
	 */
	private String address;
	/**
	 * �û����
	 * ��Ӧ���ݿ�founds
	 */
	private Float founds;
	/**
	 * �û�״̬
	 * ��Ӧ���ݿ�user_status
	 * 0 �����û�����״̬
	 * 1 �����û�����״̬
	 */
	private String userStatus;
	/**
	 * �û�email��ַ
	 * ��Ӧ���ݿ�email
	 */
	private String email;
	/**
	 * �û���������
	 * ��Ӧ���ݿ� birthday
	 */
	private String birthday;
	/**
	 * �û��Ա�
	 * ��Ӧ���ݿ�sex
	 * ��
	 * Ů
	 */
	private String sex;
	/**
	 * �û�ע��ʱ��
	 * ��Ӧ���ݿ�create_time
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
