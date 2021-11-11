package com.jones;

public class Employee {
    
    public String employeeName;
    public String employeeId;
    public String employeeAddress;
    public String employeeMail;
    public String mobileNumber;

    public Employee(String employeeName, String employeeId, String employeeAddress, String employeeMail, String mobileNumber) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeAddress = employeeAddress;
        this.employeeMail = employeeMail;
        this.mobileNumber = mobileNumber;
    }

    public Employee(){
        //For a reason
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeMail() {
        return employeeMail;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }


    public Employee getInstance(String employeeName, String employeeId, String employeeAddress, String employeeMail, String mobileNumber){
        return new Employee(employeeName,employeeId,employeeAddress,employeeMail,mobileNumber);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeMail='" + employeeMail + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
