package com.tka.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class MemberPayment {

	@Id
	private int memberId;
	private String memberName;
	private double amountPaid;
	private String paymentDate;
	private String paymentMode;
	private String paymentFor;
	private String remarks;

	public MemberPayment() {
	}

	public MemberPayment(int paymentId, int memberId, double amountPaid, String paymentDate, String paymentMode,
			String paymentFor, String remarks) {
		
		this.memberId = memberId;
		this.amountPaid = amountPaid;
		this.paymentDate = paymentDate;
		this.paymentMode = paymentMode;
		this.paymentFor = paymentFor;
		this.remarks = remarks;
	}

	

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentFor() {
		return paymentFor;
	}

	public void setPaymentFor(String paymentFor) {
		this.paymentFor = paymentFor;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "MemberPayment [ memberId=" + memberId + ", amountPaid=" + amountPaid
				+ ", paymentDate=" + paymentDate + ", paymentMode=" + paymentMode + ", paymentFor=" + paymentFor
				+ ", remarks=" + remarks + "]";
	}

}
