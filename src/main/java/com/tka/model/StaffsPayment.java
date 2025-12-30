package com.tka.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StaffsPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staffId;

    private String staffName;
    private String staffRole;
    private double salaryAmount;
    private String salaryDate;
    private String salaryMode;
    private String salaryFor;
    private String remarks;

    public StaffsPayment() {
    }

    // Getters and Setters
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

    public String getStaffRole() {
        return staffRole;
    }

    public void setStaffRole(String staffRole) {
        this.staffRole = staffRole;
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public String getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(String salaryDate) {
        this.salaryDate = salaryDate;
    }

    public String getSalaryMode() {
        return salaryMode;
    }

    public void setSalaryMode(String salaryMode) {
        this.salaryMode = salaryMode;
    }

    public String getSalaryFor() {
        return salaryFor;
    }

    public void setSalaryFor(String salaryFor) {
        this.salaryFor = salaryFor;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "StaffsPayment [staffId=" + staffId + ", staffName=" + staffName +
                ", staffRole=" + staffRole + ", salaryAmount=" + salaryAmount +
                ", salaryDate=" + salaryDate + ", salaryMode=" + salaryMode +
                ", salaryFor=" + salaryFor + ", remarks=" + remarks + "]";
    }
}
