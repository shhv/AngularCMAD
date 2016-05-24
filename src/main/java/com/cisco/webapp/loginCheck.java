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
public class loginCheck {

	private String postEmail="";
	private String password="";
	
	public String getpostEmail() {
		return postEmail;
	}
	public void setpostEmail(String emailId) {
		this.postEmail = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Users [emailId=" + postEmail
				+ ", password=" + password + "]";
	}

}