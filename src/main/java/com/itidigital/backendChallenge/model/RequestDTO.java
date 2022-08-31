package com.itidigital.backendChallenge.model;

import java.io.Serializable;

public class RequestDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
