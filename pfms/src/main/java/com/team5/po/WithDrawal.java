package com.team5.po;
/**
 * ȡ���¼ ��Ӧ���ݿ�withdrawal_slip
 * @author Mevur
 *
 */
public class WithDrawal {
	/**
	 * ȡ����
	 * ��Ӧ���ݿ�withdrawal_id
	 */
	private Integer withdrawalId;
	/**
	 * �û�id
	 * ��Ӧ���ݿ�user_id
	 */
	private String userId;
	/**
	 * ȡ������
	 * ��Ӧ���ݿ�date
	 */
	private String date;
	/**
	 * ȡ����
	 * ��Ӧ���ݿ�money
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
