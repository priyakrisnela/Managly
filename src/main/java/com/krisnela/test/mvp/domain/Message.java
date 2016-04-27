package com.krisnela.test.mvp.domain;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Message extends AbstractDto{
	

	private String message;
	private int sentFrom;
	public int getSentFrom() {
		return sentFrom;
	}
	public void setSentFrom(int sentFrom) {
		this.sentFrom = sentFrom;
	}
	@DBRef
	private MessageThread messageThread;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public MessageThread getMessageThread() {
		return messageThread;
	}
	public void setMessageThread(MessageThread messageThread) {
		this.messageThread = messageThread;
	}

}
