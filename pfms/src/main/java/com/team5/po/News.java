package com.team5.po;
/**
 * 
 * @author newlie
 *新闻实体，对应于数据库news表
 */
public class News {
	
	/**
	 * 新闻id
	 * 对应于数据库中news_id
	 */
	private int id;
	
	/**
	 * 管理员（新闻发布）id
	 * 对应于数据库manager_id
	 */
	private String managerId;
	
	/**
	 * 新闻发布时间
	 * 对应于数据库date
	 */
	private String date;
	
	/**
	 * 新闻标题
	 * 对应于数据库title
	 */
	private String title;
	
	/**
	 * 新闻内容
	 * 对应数据库content
	 */
	private String content;
	
	/**
	 * 新闻摘要
	 * 对应于数据库abstract
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
