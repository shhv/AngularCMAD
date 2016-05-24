package com.cisco.webapp;

public class Comment {

	String title="";
	String comment="";
	
	
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public String getcomment() {
		return comment;
	}
	public void setcomment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Comment [title=" + title + ", comment=" + comment + "]";
	}
	
}
