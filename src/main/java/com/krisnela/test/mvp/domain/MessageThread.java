package com.krisnela.test.mvp.domain;



import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="messagethread")
public class MessageThread extends AbstractDto {

	@DBRef
	private User sender;
	@DBRef
	private User receiver;
	
	List<MessgeSubClass> messages;
	
	

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}
	public MessageThread(){}
	public MessageThread(String objectId){
		this.objectId=objectId;
	}


}