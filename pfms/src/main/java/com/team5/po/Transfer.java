package com.team5.po;
/**
 * ת�˱�ʵ�壬��Ӧ���ݿ�transfer_voucher
 * @author newlie
 *
 */
public class Transfer {
	
/**
 * ת�˱�id
 * ��Ӧ�����ݿ�transfer_id
 */
	private int id;
	
/**
 * ת���˻����Լ���id
 * ��Ӧ�����ݿ�user_id
 */
	private String userId;
	
	/**
	 * ת���˻�
	 * ��Ӧ�����ݿ�in_account
	 */
	private String account;
	
	/**
	 * ���
	 * ��Ӧ�����ݿ�money
	 */
	private Float money;
	
	/**
	 * ת��ʱ��
	 * ��Ӧ���ݿ�date
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
