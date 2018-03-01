package com.team5.po;
/**
 * 转账表实体，对应数据库transfer_voucher
 * @author newlie
 *
 */
public class Transfer {
	
/**
 * 转账表id
 * 对应于数据库transfer_id
 */
	private int id;
	
/**
 * 转出账户（自己）id
 * 对应于数据库user_id
 */
	private String userId;
	
	/**
	 * 转入账户
	 * 对应于数据库in_account
	 */
	private String account;
	
	/**
	 * 金额
	 * 对应于数据库money
	 */
	private Float money;
	
	/**
	 * 转账时间
	 * 对应数据库date
	 */
	private String date;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Float getMoney() {
		return money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
