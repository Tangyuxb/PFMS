package com.team5.po;
/**
 * 新闻操作记录 对应数据库表news_recording
 * @author Mevur
 *
 */
public class NRecording {
	/**
	 * 新闻操作记录编号
	 * 对应数据库news_recording_id
	 */
	private Integer newsRecordingId;
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
	 *新闻编号
	 *对应数据库news_id
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
