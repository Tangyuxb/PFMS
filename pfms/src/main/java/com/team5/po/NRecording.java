package com.team5.po;
/**
 * ���Ų�����¼ ��Ӧ���ݿ��news_recording
 * @author Mevur
 *
 */
public class NRecording {
	/**
	 * ���Ų�����¼���
	 * ��Ӧ���ݿ�news_recording_id
	 */
	private Integer newsRecordingId;
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
	 *���ű��
	 *��Ӧ���ݿ�news_id
	 */
	private Integer newsId;
	public Integer getNewsRecordingId() {
		return newsRecordingId;
	}
	public void setNewsRecordingId(Integer newsRecordingId) {
		this.newsRecordingId = newsRecordingId;
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
	public Integer getNewsId() {
		return newsId;
	}
	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}
}
