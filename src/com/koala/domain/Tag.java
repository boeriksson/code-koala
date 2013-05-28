package com.koala.domain;

import com.google.appengine.api.datastore.Entity;

public class Tag {
	
	long id;
	long postId;
	String tag;
	
	public Tag() {}
	
	public Tag(long postId, String tag) {
		this.postId = postId;
		this.tag = tag;
	}
	
	public Tag(Entity tagE) {
		this.id = tagE.getKey().getId();
		this.postId = (long) tagE.getProperty("postId");
		this.tag = (String) tagE.getProperty("tag");
	}
	
	public Entity toEntity() {
		Entity tagE = new Entity("Tag");
		tagE.setProperty("postId", postId);
		tagE.setProperty("tag", tag);
		
		return tagE;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	

}
