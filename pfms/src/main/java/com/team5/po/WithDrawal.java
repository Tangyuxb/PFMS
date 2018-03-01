package com.team5.po;
/**
 * 取款记录 对应数据库withdrawal_slip
 * @author Mevur
 *
 */
public class WithDrawal {
	/**
	 * 取款单编号
	 * 对应数据库withdrawal_id
	 */
	private Integer withdrawalId;
	/**
	 * 用户id
	 * 对应数据库user_id
	 */
	private String userId;
	/**
	 * 取款日期
	 * 对应数据库date
	 */
	private String date;
	/**
	 * 取款金额
	 * 对应数据库money
	 */
	private Float money;
	public Integer getWithdrawalId() {
		return withdrawalId;
	}
	public void setWithdrawalId(Integer withdrawalId) {
		this.withdrawalId = withdrawalId;
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
