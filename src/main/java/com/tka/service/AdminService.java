package com.tka.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.AdminDao;
import com.tka.model.AdminLogin;
import com.tka.model.ContactAdmin;
import com.tka.model.MemberAttendance;
import com.tka.model.MemberPayment;
import com.tka.model.Members;
import com.tka.model.StaffAttendance;
import com.tka.model.StaffSalary;
import com.tka.model.Staffs;
import com.tka.model.StaffsPayment;

import java.util.List;

@Service
public class AdminService {

	@Autowired

	AdminDao dao;

	public boolean verifyRegisterDetails(Members members) {
		System.err.println("in Service");
		return dao.verifyRegisterDetails(members);
	}

	public List<Members> getMembersList() {
		return dao.getMembersList();
	}

	public boolean verifyStaffRegisterDetails(Staffs staffs) {
		System.err.println(staffs);
		return dao.verifyStaffRegisterDetails(staffs);
	}

	public List<Staffs> getStaffsList() {
		return dao.getStaffsList();
	}

	public boolean verifyStaffSalaryDetails(StaffSalary staffSalary) {
		return dao.verifyStaffRegisterDetails(staffSalary);
	}

	public boolean verifyMemberPaymentDetails(MemberPayment memberPayment) {
		return dao.verifyMemberPaymentDetails(memberPayment);
	}

	public String updateMember(Members members) {
		return dao.updateMember(members);
	}

	public String deleteMember(int mid) {
		return dao.deleteMember(mid);
	}

	public Members getProductByID(int mid) {
		return dao.getProductByID(mid);
	}

	public String deleteStaff(int sid) {	
		return dao.deleteStaff(sid);
	}

	public Staffs getProductByStaffID(int sid) {
		return dao.getProductByStaffID(sid);
	}

	public String updateMember(Staffs staffs) {
		return dao.updateMember(staffs);
	}

	public List<Members> getMemberAttendance() {
		return dao.getMemberAttendance();
	}

	public Object saveMemberAttendance(MemberAttendance memberA) {
		return dao.saveMemberAttendance(memberA);
		
	}

	public List<Staffs> getStaffAttendance() {
		return dao.getStaffAttendance();
	}

	public Object saveStaffAttendance(StaffAttendance staffA) {
		return dao.saveStaffAttendance(staffA);
		
	}

	public List<MemberAttendance> getMemberAttendanceReport() {
		return dao.getMemberAttendanceReport();
	}

	public List<StaffAttendance> getStaffAttendanceReport() {
		return dao.getStaffAttendanceReport();
	}

	public List<MemberPayment> getMemberPaymentReport() {
		return dao.getMemberPaymentReport();
	}

	public List<StaffSalary> getStaffSalaryReport() {
		return dao.getStaffSalaryReport();
	}

	

	

}
