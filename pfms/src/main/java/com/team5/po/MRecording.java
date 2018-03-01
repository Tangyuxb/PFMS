package com.team5.po;
/**
 * 管理员操作记录 对应数据库表manager_recording
 * @author Mevur
 *
 */
public class MRecording {
	/**
	 * 操作记录编号
	 * 对应数据库recording_id
	 */
	private Integer recordingId;
	/**
	 * 管理员用户id
	 * 对应数据库manager_id
	 */
	private String managerId;
	/**
	 * 操作时间
	 * 对应数据库date
	 */
	private String date;
	/**
	 * 操作对象账户
	 * 对应数据库concern_account
	 */
	private String concernAccount;
	/**
	 * 操作
	 * 对应数据库action
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
