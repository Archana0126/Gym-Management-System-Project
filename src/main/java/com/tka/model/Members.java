package com.tka.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "members") 
public class Members {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	int mid ;
	String mname ;
	String mgender ;
	int mage ;
	String maddress ;
	String  mcontact ;
	String membershipType ;
	String membershipStartDate ;
	String membershipEndDate ;
	
	
	public Members() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Members(int mid, String mname, String mgender, int mage, String maddress, String mcontact,
			String membershipType, String membershipStartDate, String membershipEndDate) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mgender = mgender;
		this.mage = mage;
		this.maddress = maddress;
		this.mcontact = mcontact;
		this.membershipType = membershipType;
		this.membershipStartDate = membershipStartDate;
		this.membershipEndDate = membershipEndDate;
	}

	
	
	
	

	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getMgender() {
		return mgender;
	}


	public void setMgender(String mgender) {
		this.mgender = mgender;
	}


	public int getMage() {
		return mage;
	}


	public void setMage(int mage) {
		this.mage = mage;
	}


	public String getMaddress() {
		return maddress;
	}


	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}


	public String getMcontact() {
		return mcontact;
	}


	public void setMcontact(String mcontact) {
		this.mcontact = mcontact;
	}


	public String getMembershipType() {
		return membershipType;
	}


	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}


	public String getMembershipStartDate() {
		return membershipStartDate;
	}


	public void setMembershipStartDate(String membershipStartDate) {
		this.membershipStartDate = membershipStartDate;
	}


	public String getMembershipEndDate() {
		return membershipEndDate;
	}


	public void setMembershipEndDate(String membershipEndDate) {
		this.membershipEndDate = membershipEndDate;
	}


	@Override
	public String toString() {
		return "Members [mid=" + mid + ", mname=" + mname + ", mgender=" + mgender + ", mage=" + mage + ", maddress="
				+ maddress + ", mcontact=" + mcontact + ", membershipType=" + membershipType + ", membershipStartDate="
				+ membershipStartDate + ", membershipEndDate=" + membershipEndDate + "]";
	}


	

	

	
	
	
	
	

}
