package com.team5.po;
/**
 * ����Ա������¼ ��Ӧ���ݿ��manager_recording
 * @author Mevur
 *
 */
public class MRecording {
	/**
	 * ������¼���
	 * ��Ӧ���ݿ�recording_id
	 */
	private Integer recordingId;
	/**
	 * ����Ա�û�id
	 * ��Ӧ���ݿ�manager_id
	 */
	private String managerId;
	/**
	 * ����ʱ��
	 * ��Ӧ���ݿ�date
	 */
	private String date;
	/**
	 * ���������˻�
	 * ��Ӧ���ݿ�concern_account
	 */
	private String concernAccount;
	/**
	 * ����
	 * ��Ӧ���ݿ�action
	 */
	private String action;
	public Integer getRecordingId() {
		return recordingId;
	}
	public void setRecordingId(Integer recordingId) {
		this.recordingId = recordingId;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getConcernAccount() {
		return concernAccount;
	}
	public void setConcernAccount(String concernAccount) {
		this.concernAccount = concernAccount;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
}
