package com.duan.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * com.duan.action
 * Created by Da DUAN on 2015/12/01.
 */
public class EmployeeAction extends ActionSupport {
	private String message;

	public String execute() {
		System.out.println("---> called here!");
		setMessage("From execute method");
		return SUCCESS;
	}

	public String login() {
		setMessage("From login method");
		return SUCCESS;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
