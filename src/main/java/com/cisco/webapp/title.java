package com.cisco.webapp;

public class title {

	String title="";
	String description="";
	Integer id;
	Integer value;
	
	public Integer getvalue() {
		return value;
	}
	public void setvalue(Integer comment) {
		this.value = comment;
	}
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
	@Override
	public String toString() {
		return "title [title=" + title + ", description=" + description
				+ ", id=" + id + ", value=" + value + "]";
	}
	
	
}
