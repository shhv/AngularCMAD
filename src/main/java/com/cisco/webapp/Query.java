package com.cisco.webapp;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


@SuppressWarnings("unused")
public class Query {

	private String postTitle="";
	private String postAbout="";
	private String postEmail="";
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostAbout() {
		return postAbout;
	}
	public void setPostAbout(String postAbout) {
		this.postAbout = postAbout;
	}
	public String getPostEmail() {
		return postEmail;
	}
	public void setPostEmail(String postEmail) {
		this.postEmail = postEmail;
	}
	@Override
	public String toString() {
		return "Query [postTitle=" + postTitle + ", postAbout=" + postAbout
				+ ", postEmail=" + postEmail + "]";
	}

	
	
}