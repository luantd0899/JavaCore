/**
 * 
 */
package com.vti.entity;


import java.util.Date;

/**
 * @author luant
 *
 */
public class Exam {
	private int examId;
	private int code;
	private String title;
	private CategoryQuestion categoryId;
	private int duration;
	private int creatorId;
	private Date createDate;
	
	
	
	
	public Exam() {
		
	}


	public Exam(int examId, int code, String title, CategoryQuestion categoryId, int duration, int creatorId,
			Date createDate) {
		
		this.examId = examId;
		this.code = code;
		this.title = title;
		this.categoryId = categoryId;
		this.duration = duration;
		this.creatorId = creatorId;
		this.createDate = createDate;
	}


	public int getExamId() {
		return examId;
	}


	public void setExamId(int examId) {
		this.examId = examId;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public CategoryQuestion getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(CategoryQuestion categoryId) {
		this.categoryId = categoryId;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public int getCreatorId() {
		return creatorId;
	}


	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
	
	
	
}
