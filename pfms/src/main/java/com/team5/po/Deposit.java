package com.team5.po;
/**
 * 
 * @author newlie
 * 存款实体，对应于数据库deposit_slip表
 *
 */
public class Deposit {
	
/**
 * 存款单id
 * 对应于数据库deposit_id
 */
	private int depositId;
	
	/**
	 * 存款用户id
	 * 对应于数据库user_id
	 */
	private String userId;
	
	/**
	 * 存款时间
	 * 对应于数据库date
	 */
	private String date;
	
	/**
	 * 存款金额
	 * 对应于数据库money
	 */
	private Float money;

	
	
	public int getDepositId() {
		return depositId;
	}

	public void setDepositId(int depositId) {
		this.depositId = depositId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Float getMoney() {
		return money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}
	
	
}
