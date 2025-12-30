package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.model.MemberAttendance;
import com.tka.model.MemberPayment;
import com.tka.model.Members;
import com.tka.model.StaffAttendance;
import com.tka.model.StaffSalary;
import com.tka.model.Staffs;


@Repository
public class AdminDao {

	@Autowired
	SessionFactory sessionFactory;
	Session session = null;
	Members members = null;
	Staffs staffs = null;

	public boolean verifyRegisterDetails(Members members) {
		session = sessionFactory.openSession();
		System.err.println("in Dao");
		session.save(members);
		session.beginTransaction().commit();

		Members userDB = session.get(Members.class, members.getMid());

		if (userDB.getMid() == members.getMid()) {

			return true;

		} else {
			return false;
		}

	}

	public List<Members> getMembersList() {
		session = sessionFactory.openSession();
		List<Members> memberList = session.createCriteria(Members.class).list();
		System.out.println(memberList);
		return memberList;
	}

	public boolean verifyStaffRegisterDetails(Staffs staffs) {

		session = sessionFactory.openSession();
		session.save(staffs);
		session.beginTransaction().commit();

		Staffs userDB = session.get(Staffs.class, staffs.getSid());

		if (userDB.getSid() == staffs.getSid()) {

			return true;

		} else {
			return false;
		}
	}

	public List<Staffs> getStaffsList() {
		session = sessionFactory.openSession();
		List<Staffs> staffsList = session.createCriteria(Staffs.class).list();
		System.out.println(staffsList);
		return staffsList;
	}

	public boolean verifyStaffRegisterDetails(StaffSalary staffSalary) {
	    try {
	    	session = sessionFactory.openSession();
	        session.save(staffSalary);
	        session.beginTransaction().commit();
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        session.getTransaction().rollback();
	        return false;
	    }
	}


	public boolean verifyMemberPaymentDetails(MemberPayment memberPayment) {

		 try {
		    	session = sessionFactory.openSession();
		        session.save(memberPayment);
		        session.beginTransaction().commit();
		        return true;
		    } catch (Exception e) {
		        e.printStackTrace();
		        session.getTransaction().rollback();
		        return false;
		    }
	}

	public Members getProductByID(int mid) {
		session = sessionFactory.openSession();
		Members members = session.get(Members.class, mid);
		session.close();
		System.out.println(members);
		return members;
	}

	public String updateMember(Members members) {
		session = sessionFactory.openSession();
		session.saveOrUpdate(members);
		session.beginTransaction().commit();

		Members userDB = session.get(Members.class, members.getMid());

		if (userDB.getMid() == members.getMid()) {

			return members.getMid() + "<<<<<< Updated";

		} else {
			return members.getMid() + "<<<<<< Not Updated";
		}
	}

	public String deleteMember(int mid) {

		System.err.println("In dao - delete User");
		session = sessionFactory.openSession();

		members = session.get(Members.class, mid);
		session.delete(members);

		session.beginTransaction().commit();
		System.out.println(mid + ">>>Deleted");

		return mid + " >>> Deleted";
	}

	public String deleteStaff(int sid) {

		System.err.println("In dao - delete Staff");
		session = sessionFactory.openSession();

		staffs = session.get(Staffs.class, sid);
		session.delete(staffs);

		session.beginTransaction().commit();
		System.out.println(sid + ">>>Deleted");

		return sid + " >>> Deleted";
	}

	public Staffs getProductByStaffID(int sid) {
		
		session = sessionFactory.openSession();
		Staffs staffs = session.get(Staffs.class, sid);
		session.close();
		System.out.println(staffs);
		return staffs;
	}

	public String updateMember(Staffs staffs) {
		session = sessionFactory.openSession();
		session.saveOrUpdate(staffs);
		session.beginTransaction().commit();

		Staffs userDB = session.get(Staffs.class, staffs.getSid());

		if (userDB.getSid() == staffs.getSid()) {

			return staffs.getSid() + "<<<<<< Updated";

		} else {
			return staffs.getSid() + "<<<<<< Not Updated";
		}
	}

	public List<Members> getMemberAttendance() {
		session = sessionFactory.openSession();
		List<Members> MembersList = session.createCriteria(Members.class).list();
		System.out.println(MembersList);
		return MembersList;
	}

	public Object saveMemberAttendance(MemberAttendance membersA) {
		session = sessionFactory.openSession();
		System.err.println("in Dao");
		session.beginTransaction().commit();
		session.save(membersA);
		return null;
	}

	public List<Staffs> getStaffAttendance() {		
		session = sessionFactory.openSession();
		List<Staffs> staffsList = session.createCriteria(Staffs.class).list();
		System.out.println(staffsList);
		return staffsList;
	}

	public Object saveStaffAttendance(StaffAttendance staffA) {
		session = sessionFactory.openSession();
		session.beginTransaction().commit();
		session.save(staffA);
		return null;
	}

	public List<MemberAttendance> getMemberAttendanceReport() {
		session = sessionFactory.openSession();
		List<MemberAttendance> memberAttendanceList = session.createCriteria(MemberAttendance.class).list();
		System.out.println(memberAttendanceList);
		return memberAttendanceList;
	}

	public List<StaffAttendance> getStaffAttendanceReport() {
		session = sessionFactory.openSession();
		List<StaffAttendance> staffAttendanceList = session.createCriteria(StaffAttendance.class).list();
		System.out.println(staffAttendanceList);
		return staffAttendanceList;
	}

	public List<MemberPayment> getMemberPaymentReport() {
		session = sessionFactory.openSession();
		List<MemberPayment> memberPaymentR = session.createCriteria(MemberPayment.class).list();
		System.out.println(memberPaymentR);
		return memberPaymentR;
	}

	public List<StaffSalary> getStaffSalaryReport() {
		session = sessionFactory.openSession();
		List<StaffSalary> staffPaymentR = session.createCriteria(StaffSalary.class).list();
		System.err.println(staffPaymentR);
		System.err.println("Hello");
		return staffPaymentR;
	}

}
