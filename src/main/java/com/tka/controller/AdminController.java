package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tka.model.ContactAdmin;
import com.tka.model.MemberAttendance;
import com.tka.model.MemberPayment;
import com.tka.model.Members;
import com.tka.model.StaffAttendance;
import com.tka.model.StaffSalary;
import com.tka.model.Staffs;
import com.tka.model.StaffsPayment;
import com.tka.service.AdminService;

import java.util.List;

@Controller
public class AdminController {

	@Autowired
	AdminService adminService;
	String msg = "";

	/* ======== Open =========== */

	@GetMapping("/")
	public String showLoginPage(Model model) {
		return "Welcome";
	}

	@PostMapping("/open-LoginPage")
	public String openLoginPage() {
		return "Login";
	}

	@PostMapping("/open-HomePage")
	public String openHomePage() {
		return "Home";
	}

	@GetMapping("/open-DashboardPage")
	public String openDashboardPage() {
		return "Home";
	}

	@GetMapping("/open-memberPage")
	public String openTrialPage() {
		return "ViewMembers"; 
	}

	@GetMapping("/open-LogoutPage")
	public String openLogoutPage() {
		return "Logout"; 
	}

	@GetMapping("/open-AddMembers")
	public String openAddMembersPage() {
		return "AddMembers";
	}

	@GetMapping("/open-AddStaff")
	public String openAddStaffPage() {
		return "AddStaff";
	}

	@GetMapping("/open-MembershipPlan")
	public String openMembershipPlan() {
		return "Memberships";
	}

	@GetMapping("/open-EquipmentPage")
	public String openEquipmentPage() {
		return "Equipments";
	}

	@GetMapping("/open-PaymentPage")
	public String openPaymentPage() {
		return "Payments";
	}

	@GetMapping("/open-MemberPaymentPage")
	public String openMemberPaymentPage() {
		return "MemberPayment";
	}

	@GetMapping("/open-StaffSalaryPage")
	public String openStaffSalaryPage() {
		return "StaffSalary";
	}

	@GetMapping("/open-ContactToAdminPage")
	public String openContactToAdminPage() {
		return "ContactToAdmin";
	}

	@GetMapping("/open-ReportPage")
	public String openReportPage() {
		return "Report";
	}
	
	@GetMapping("/open-ContactAdmin")
	public String openContactAdmin() {
		return "Welcome";
	}
	
	
	@GetMapping("/open-Page")
	public String Page() {
		return "SON";
	}
	

	/* ======== View The Data =========== */

	@GetMapping("/view-AllMembers")
	public String viewAllMembers(Model model) {
		List<Members> membersList = adminService.getMembersList();
		System.out.println(membersList);
		model.addAttribute("membersList", membersList);
		return "ViewMembers";
	}

	@GetMapping("/view-AllStaffs")
	public String viewAllStaffs(Model model) {
		List<Staffs> staffsList = adminService.getStaffsList();
		System.err.println(staffsList);
		model.addAttribute("staffsList", staffsList);
		return "ViewStaffs";
	}

	/* ======== Store the data =========== */

	@PostMapping("/verify-MembersRegistrationDetails")
	public String verifyRegistrationDetails(@ModelAttribute Members members, Model model) {
		System.err.println(">>>>>>Member Registration Deatils");
		System.err.println(members);

		boolean isRegister = adminService.verifyRegisterDetails(members);
		String msgRegister = "";

		if (isRegister == true) {
			System.out.println("Successfull");
			msgRegister = members.getMid() + " Register Successful ";
			System.err.println(msgRegister);
			model.addAttribute("msg", msgRegister);
			return "Home";
		} else {
			msgRegister = members.getMid() + " Register Failed ";
			System.err.println(msgRegister);
			model.addAttribute("msg", msgRegister);
			return "SON";

		}

	}

	@PostMapping("/verify-StaffRegistrationDetails")
	public String verifyStaffRegistrationDetails(@ModelAttribute Staffs staffs, Model model) {
		System.err.println(">>>>>>Staff Registration Deatils");
		System.err.println(staffs);

		boolean isRegister = adminService.verifyStaffRegisterDetails(staffs);
		String msgRegister = "";

		if (isRegister == true) {
			System.out.println("Successfull");
			msgRegister = staffs.getSid() + " Register Successful ";
			System.err.println(msgRegister);
			model.addAttribute("msg", msgRegister);
			return "SON";
		} else {
			msgRegister = staffs.getSid() + " Register Failed ";
			System.err.println(msgRegister);
			model.addAttribute("msg", msgRegister);
			return "SON";

		}

	}

	@PostMapping("/verify-StaffSalaryDetails")
	public String verifyStaffSalaryDetails(@ModelAttribute StaffSalary staffSalary, Model model) {
		System.err.println(">>>>>>Staff Salary Deatils");
		System.err.println(staffSalary);

		boolean isRegister = adminService.verifyStaffSalaryDetails(staffSalary);
		String msgRegister = "";

		if (isRegister == true) {
			System.out.println("Successfull");
			msgRegister = staffSalary.getStaffId() + " Register Successful ";
			System.err.println(msgRegister);
			model.addAttribute("msg", msgRegister);
			return "SON";
		} else {
			msgRegister = staffSalary.getStaffId() + " Register Failed ";
			System.err.println(msgRegister);
			model.addAttribute("msg", msgRegister);
			return "SON";

		}

	}

	@PostMapping("/verify-MemberPaymentDetails")
	public String verifyMemberPaymentDetails(@ModelAttribute MemberPayment memberPayment, Model model) {
		System.err.println(">>>>>>Member Payment Deatils");
		System.err.println(memberPayment);

		boolean isRegister = adminService.verifyMemberPaymentDetails(memberPayment);
		String msgRegister = "";

		if (isRegister == true) {
			System.out.println("Successfull");
			msgRegister = memberPayment.getMemberId() + " Register Successful ";
			System.err.println(msgRegister);
			model.addAttribute("msg", msgRegister);
			return "SON";
		} else {
			msgRegister = memberPayment.getMemberId() + " Register Failed ";
			System.err.println(msgRegister);
			model.addAttribute("msg", msgRegister);
			return "SON";

		}

	}

	/* =========== For Members ============= */

	@GetMapping("/edit-members")
	public String editUser(@RequestParam int mid, Model model) {

		Members members = adminService.getProductByID(mid);
		System.err.println(members);
		model.addAttribute("member", members);

		return "UpdateMember";
	}

	@PostMapping("/update-Member")
	public String updateUser(@ModelAttribute Members members, RedirectAttributes redirectAttributes) {
	    System.out.println("In Controller ---> Member Updated **************");
	    System.out.println(members);

	    String msg = adminService.updateMember(members);
	    redirectAttributes.addFlashAttribute("msg", msg);
	    redirectAttributes.addFlashAttribute("type", "update");

	    return "SON"; // redirect to your page
	}

	@GetMapping("/delete-member")
	public String deleteUser(@RequestParam int mid, Model model) {
		System.err.println("In Controller---> Member Deleted");
		msg = adminService.deleteMember(mid);
		model.addAttribute("msg", msg);
		return "SON";

	}
	
	
	 /* =========== For Staff =============*/
	
	@GetMapping("/edit-staff")
	public String editStaff(@RequestParam int sid, Model model) {

		Staffs staffs = adminService.getProductByStaffID(sid);
		System.err.println(staffs);
		model.addAttribute("staff", staffs);

		return "EditStaff";
	}

	@PostMapping("/update-staff")
	public String updateStaff(@ModelAttribute Staffs staffs, Model model) {
		System.err.println("In Controller---> Staff Updated**************");
		System.err.println(staffs);
		msg = adminService.updateMember(staffs);
		model.addAttribute("msg", msg);
		return "SON";
	}

	@GetMapping("/delete-staff")
	public String deleteStaff(@RequestParam int sid, Model model) {
		System.err.println("In Controller---> Staff Deleted");
		msg = adminService.deleteStaff(sid);
		model.addAttribute("msg", msg);
		return "SON";

	}
	
	 /* =========== For Member Attendence =============*/
	
	@GetMapping("/get-MemberAttendance")
	public String getMemberAttendance(Model model) {
    	List<Members> MemberAttendance = adminService.getMemberAttendance();
		System.err.println(MemberAttendance);
		model.addAttribute("membersList", MemberAttendance);
		return "MemberAttendence";
	}
	
	@PostMapping("/save-Attendance")
	public String saveAttendance(
	        @RequestParam("memberId[]") int[] memberIds,
	        @RequestParam("memberName[]") String[] memberNames,
	        @RequestParam("date[]") String[] dates,
	        @RequestParam("status[]") String[] statuses ){

	    for (int i = 0; i < memberIds.length; i++) {
	        MemberAttendance memberA = new MemberAttendance();
	        memberA.setMemberId(memberIds[i]);
	        memberA.setMemberName(memberNames[i]);
	        memberA.setDate(dates[i]);
	        memberA.setStatus(statuses[i]);
	        adminService.saveMemberAttendance(memberA);
	        
	    }
	    
	   
	    return "redirect:/open-Page";
	}
	
/* =========== For staffAttendence =============*/
	
	@GetMapping("/get-StaffAttendance")
	public String getStaffAttendance(Model model) {
    	List<Staffs> StaffAttendance = adminService.getStaffAttendance();
		model.addAttribute("staffList", StaffAttendance);
		return "StaffAttendence";
	}
	
	@PostMapping("/save-StaffAttendance")
	public String saveStaffsAttendance(
	        @RequestParam("staffId[]") int[] staffIds,
	        @RequestParam("staffName[]") String[] staffNames,
	        @RequestParam("date[]") String[] dates,
	        @RequestParam("status[]") String[] statuses ){

	    for (int i = 0; i < staffIds.length; i++) {
	    	StaffAttendance staffA = new StaffAttendance();
	    	staffA.setStaffId(staffIds[i]);
	    	staffA.setStaffName(staffNames[i]);
	    	staffA.setDate(dates[i]);
	    	staffA.setStatus(statuses[i]);
	        adminService.saveStaffAttendance(staffA);
	        
	    }
	    
	    return "redirect:/open-Page";
	
	}
	
	/* =========== For Report =============*/
	
	@GetMapping("/member-attendance-report")
	public String getMemberAttendanceReport(Model model) {
    	List<MemberAttendance> MemberAttendance = adminService.getMemberAttendanceReport();
    	System.err.println(MemberAttendance);
		model.addAttribute("memberAttendance", MemberAttendance);
		return "MemberAttendanceReport";
	}
	
	@GetMapping("/staff-attendance-report")
	public String getStaffAttendanceReport(Model model) {
    	List<StaffAttendance> staffAttendance = adminService.getStaffAttendanceReport();
    	System.err.println(staffAttendance);
		model.addAttribute("staffAttendance", staffAttendance);
		return "StaffsAttendanceReport";
	}
	
	@GetMapping("/members-payments-report")
	public String getMemberPaymentReport(Model model) {
    	List<MemberPayment> memberPaymentR = adminService.getMemberPaymentReport();
    	System.err.println(memberPaymentR);
		model.addAttribute("memberPaymentR", memberPaymentR);
		return "MembersPaymentReport";
	}
	
	@GetMapping("/staff-salary-report")
	public String getStaffSalaryReport(Model model) {
    	List<StaffSalary> staffSalaryR = adminService.getStaffSalaryReport();
    	System.err.println("---------------");
		model.addAttribute("staffSalaryR", staffSalaryR);
		return "StaffsSalaryReport";
	}
	
	
}

	



