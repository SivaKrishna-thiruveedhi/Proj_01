package com.library.model;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Autowired;


public class Message {
	
	private String msg;

	public Message() {
		super();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}	
	
}
