package com.tka.model;

import javax.persistence.*;

@Entity
@Table(name = "staff_attendance")
public class StaffAttendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    private int attendanceId;

    @Column(name = "staff_id")
    private int staffId;

    @Column(name = "staff_name")
    private String staffName;

    @Column(name = "attendance_date")
    private String date;

    @Column(name = "status")
    private String status;

  
    public StaffAttendance() {}


    public StaffAttendance(int staffId, String staffName, String date, String status) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.date = date;
        this.status = status;
    }

   
    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
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
