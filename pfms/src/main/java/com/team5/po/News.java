package com.team5.po;
/**
 * 
 * @author newlie
 *����ʵ�壬��Ӧ�����ݿ�news��
 */
public class News {
	
	/**
	 * ����id
	 * ��Ӧ�����ݿ���news_id
	 */
	private int id;
	
	/**
	 * ����Ա�����ŷ�����id
	 * ��Ӧ�����ݿ�manager_id
	 */
	private String managerId;
	
	/**
	 * ���ŷ���ʱ��
	 * ��Ӧ�����ݿ�date
	 */
	private String date;
	
	/**
	 * ���ű���
	 * ��Ӧ�����ݿ�title
	 */
	private String title;
	
	/**
	 * ��������
	 * ��Ӧ���ݿ�content
	 */
	private String content;
	
	/**
	 * ����ժҪ
	 * ��Ӧ�����ݿ�abstract
	 */
	private String newsAbstract;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNewsAbstract() {
		return newsAbstract;
	}

	public void setNewsAbstract(String newsAbstract) {
		this.newsAbstract = newsAbstract;
	}
	
	

}
