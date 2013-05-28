package com.koala.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Text;

@XmlRootElement
public class Post {
	
	long id; 
	String header;
	String textBody;
	long userId;
	Date created;
	Date updated;
	
	public Post() {}
	
	public Post(String header, String textBody, String userId) {
		this.header = header; 
		this.textBody = textBody; 
		this.userId = Long.valueOf(userId);
		created = new Date();
		updated = created;
	}
	
	public Post(Entity postE) {
		this.id = postE.getKey().getId();
		this.header = (String) postE.getProperty("header");
		this.textBody = (String) postE.getProperty("textBody");
		this.userId = (long) postE.getProperty("userId");
		this.created = (Date) postE.getProperty("created");
		this.updated = (Date) postE.getProperty("updated");
	}
	
	public Entity toEntity() {
		Entity postE = new Entity("Post");
		postE.setUnindexedProperty("header", header);
		postE.setUnindexedProperty("textBody", new Text(textBody));
		postE.setUnindexedProperty("userId", userId);
		postE.setProperty("created", created);
		postE.setProperty("updated", updated);
		
		return postE;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getTextBody() {
		return textBody;
	}

	public void setTextBody(String textBody) {
		this.textBody = textBody;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public long getId() {
		return id;
	}

	public Date getCreated() {
		return created;
	}

}
