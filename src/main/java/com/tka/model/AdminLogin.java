package com.tka.model;

public class AdminLogin {
	
	String aid ;
	String apswd ;
	
	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminLogin(String aid, String apswd) {
		super();
		this.aid = aid;
		this.apswd = apswd;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getApswd() {
		return apswd;
	}

	public void setApswd(String apswd) {
		this.apswd = apswd;
	}

	@Override
	public String toString() {
		return "AdminLogin [aid=" + aid + ", apswd=" + apswd + "]";
	}
	
	
	
	

}
