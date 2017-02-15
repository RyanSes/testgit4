package com.ly.Action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class UserAction {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String sayLoveyou() throws IOException {
		// HttpServletResponse resp = ServletActionContext.getResponse();
		// resp.getWriter().write("<h1 style='color:Orange'>I Love You</h1>");

		// System.out.println(user.getName());

		if (user.getName().equals("aaa") && user.getPass().equals("bbb")) {
			return "suc";
		} else {
			return "no";
		}
	}

	public String sayMissyou() throws IOException {
		HttpServletResponse resp = ServletActionContext.getResponse();
		resp.getWriter().write("<h1 style='color:red'>I Miss You</h1>");
		return null;
	}
}
