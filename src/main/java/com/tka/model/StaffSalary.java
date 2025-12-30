package com.tka.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff_salary")
public class StaffSalary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staffId;

    private String staffName;
    private double salaryAmount;
    private String salaryDate;
    private String salaryMode;
    private String salaryMonth;
    private String remarks;

    public StaffSalary() {}

    public StaffSalary(int staffId, String staffName, double salaryAmount,
                       String salaryDate, String salaryMode,
                       String salaryMonth, String remarks) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.salaryAmount = salaryAmount;
        this.salaryDate = salaryDate;
        this.salaryMode = salaryMode;
        this.salaryMonth = salaryMonth;
        this.remarks = remarks;
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

    public String getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(String salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "StaffSalary [staffId=" + staffId + ", staffName=" + staffName +
                ", salaryAmount=" + salaryAmount + ", salaryDate=" + salaryDate +
                ", salaryMode=" + salaryMode + ", salaryMonth=" + salaryMonth +
                ", remarks=" + remarks + "]";
    }
}
