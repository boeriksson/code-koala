package com.koala.domain;

import com.google.appengine.api.datastore.Entity;

public class category {
	
	long id;
	long parentId;
	String name;
	
	public category() {}
	
	public category(long postId, String tag) {
		this.parentId = parentId;
		this.name = name;
	}
	
	public category(Entity categoryE) {
		this.id = categoryE.getKey().getId();
		this.parentId = (long) categoryE.getProperty("parentId");
		this.name = (String) categoryE.getProperty("name");
	}
	
	public Entity toEntity() {
		Entity categoryE = new Entity("Category");
		categoryE.setProperty("parentId", parentId);
		categoryE.setProperty("name", name);
		
		return categoryE;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
