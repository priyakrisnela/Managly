package com.krisnela.test.mvp.domain;

import java.util.Date;

public class MessgeSubClass {
	
	private String text;
	protected Date createAt = new Date(), updatedAt = new Date();
	private int sentFrom;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public int getSentFrom() {
		return sentFrom;
	}
	public void setSentFrom(int sentFrom) {
		this.sentFrom = sentFrom;
	}

}
