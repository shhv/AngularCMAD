package com.cisco.webapp;

import java.util.List;

public class individualTitle {

	String title="";
	String description="";
	Integer id;
	List<String> comments;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<String> getComments() {
		return comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "individualTitle [title=" + title + ", description="
				+ description + ", id=" + id + ", comments=" + comments + "]";
	}
	
}
