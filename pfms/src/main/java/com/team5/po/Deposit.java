package com.team5.po;
/**
 * 
 * @author newlie
 * ���ʵ�壬��Ӧ�����ݿ�deposit_slip��
 *
 */
public class Deposit {
	
/**
 * ��id
 * ��Ӧ�����ݿ�deposit_id
 */
	private int depositId;
	
	/**
	 * ����û�id
	 * ��Ӧ�����ݿ�user_id
	 */
	private String userId;
	
	/**
	 * ���ʱ��
	 * ��Ӧ�����ݿ�date
	 */
	private String date;
	
	/**
	 * �����
	 * ��Ӧ�����ݿ�money
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
