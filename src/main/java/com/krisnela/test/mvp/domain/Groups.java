package com.krisnela.test.mvp.domain;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="grous")
public class Groups extends AbstractDto{
	public Groups() {
		super();
	}
	private String name;
	@DBRef
	private Set<User> users=new HashSet<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public Groups(String objectId) {
		this.objectId=objectId;
	}
	

}
