package com.mkyong.common;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloBean implements Serializable {

	private static final long serialVersionUID = -2197206391900495228L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSayWelcome() {
		// check if null?
		if ("".equals(name) || name == null) {
			return "";
		} else {
			return "Ajax message : Welcome " + name;
		}
	}

}
