package com.tka.model;

import javax.persistence.*;

@Entity
@Table(name = "member_attendance")
public class MemberAttendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    private int attendanceId;

    @Column(name = "member_id")
    private int memberId;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "attendance_date")
    private String date;

    @Column(name = "status")
    private String status;

    public MemberAttendance() {}

    public MemberAttendance(int memberId, String memberName, String date, String status) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.date = date;
        this.status = status;
    }

    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
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

    public void setMemberName(String memberName) {   // ✅ FIXED
        this.memberName = memberName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
