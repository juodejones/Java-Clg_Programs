package com.jones;

public class Programmer extends Employee{

    public double DA;
    public double HRA;
    public double PF;
    public double staffFundClub;
    public double basicPay;
    public Programmer(){
        //For reason
    }

    public Programmer(String employeeName, String employeeId, String employeeAddress, String employeeEmailID, String mobileNumber,double basicPay) {
        super(employeeName, employeeId, employeeAddress, employeeEmailID, mobileNumber);
        this.DA = 97;
        this.HRA = 10;
        this.PF = 12;
        this.staffFundClub = 0.1;
        this.basicPay = basicPay;
    }


    public double getDA() {
        return DA;
    }

    public double getHRA() {
        return HRA;
    }

    public double getPF() {
        return PF;
    }

    public double getStaffFundClub() {
        return staffFundClub;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public Programmer getInstance(String employeeName, String employeeId, String employeeAddress, String employeeEmailID, String mobileNumber, double basicPay){
        return new Programmer(employeeName, employeeId, employeeAddress, employeeEmailID, mobileNumber,basicPay);
    }
    public double  getGrossSalary(){
        double da = basicPay *(this.DA/100);
        double hra = basicPay *(this.HRA/100);
        double grossSalary = this.basicPay + da + hra;
        return grossSalary;
    }

    public double getNetSalary(){
        double pf = basicPay * (this.PF /100);
        double staffFund = basicPay * (this.staffFundClub/100);
        return getGrossSalary() - (pf + staffFund);
    }

    @Override
    public String toString() {
        return "---------------PAY SLIP--------------------"
                +"\nName: "+super.employeeName+"\t\t\tID: "+super.employeeId
                +"\nResidential Address: "+super.employeeAddress+"\t\tMobile number: "+super.mobileNumber
                +"\nEmail ID: "+super.employeeMail + "\nCategory: Professor\t\tBasic pay: "+this.basicPay+"\n"
                +"-------------------------------------------------------\n"+
                "Gross salary: "+this.getGrossSalary()+"\t\t\tNet salary: "+this.getNetSalary()+"\n"+
                "-------------------------------------------------------\n";
    }
}
