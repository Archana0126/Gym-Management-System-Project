package com.tka.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staffs") 
public class Staffs {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;


	String sname;
	String srole;
	String saddress;
	String scontact;
	int ssalary;
	
	public Staffs() {
		super();
		
	}

	public Staffs( String sname, String srole, String saddress, String scontact, int ssalary) {
		super();
		this.sname = sname;
		this.srole = srole;
		this.saddress = saddress;
		this.scontact = scontact;
		this.ssalary = ssalary;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSrole() {
		return srole;
	}

	public void setSrole(String srole) {
		this.srole = srole;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getScontact() {
		return scontact;
	}

	public void setScontact(String scontact) {
		this.scontact = scontact;
	}

	public int getSsalary() {
		return ssalary;
	}

	public void setSsalary(int ssalary) {
		this.ssalary = ssalary;
	}

	@Override
	public String toString() {
		return "Staffs [sid=" + sid + ", sname=" + sname + ", srole=" + srole + ", saddress=" + saddress + ", scontact="
				+ scontact + ", ssalary=" + ssalary + "]";
	}
	
	
	
	
	
	

}
