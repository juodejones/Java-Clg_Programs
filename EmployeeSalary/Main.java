package com.jones;

import java.io.DataInputStream;
import java.io.IOException;

public class Main {

    private static DataInputStream inputStream  = new DataInputStream(System.in);

    public static void main(String[] args) throws IOException {
        boolean isNotExecutable  = false;
        while (!isNotExecutable){
            System.out.println("Press: \n\t\t 1 --> Enter the application\n\t\t 2 --> Exit the application");
            int condition = Integer.parseInt(inputStream.readLine());
            switch (condition){
                case 1:
                    System.out.println("---------PAY SLIP GENERATOR----------");
                    paySlip();
                    break;
                case 2:
                    System.out.println("Exiting the application.....");
                    isNotExecutable = true;
            }
        }
    }

    private static void paySlip() throws IOException{
        System.out.println("Enter category: \n\t\t 1 --> Programmer \n\t\t 2 --> Associate Professor " +
                "\n\t\t 3 --> Assistant Professor\n\t\t 4 --> Professor");
        int condition = Integer.parseInt(inputStream.readLine());
        System.out.print("Enter Employee name and ID: ");
        String name = inputStream.readLine();
        String employeeID= inputStream.readLine();
        System.out.println("Enter Employee address: ");
        String employeeAddress = inputStream.readLine();
        System.out.println("Enter employee email ID: ");
        String employeeEmailID = inputStream.readLine();
        System.out.println("Enter employee mobile number: ");
        String employeeMobileNumber = inputStream.readLine();
        System.out.println("Enter basic pay");
        double basicPay = Double.parseDouble(inputStream.readLine());

        switch (condition){
            case 1:
                //programmer
                System.out.println((new Programmer(name,employeeID,employeeAddress,employeeEmailID,employeeMobileNumber,basicPay)).toString());
                break;
            case 2:
                //associate professor
                System.out.println((new AssociateProfessor(name,employeeID,employeeAddress,employeeEmailID,employeeMobileNumber,basicPay)).toString());
                break;
            case 3:
                //assistant professor
                System.out.println((new AssistantProfessor(name,employeeID,employeeAddress,employeeEmailID,employeeMobileNumber,basicPay)).toString());
                break;
            case 4:
                //professor
                System.out.println((new Professor(name,employeeID,employeeAddress,employeeEmailID,employeeMobileNumber,basicPay)).toString());
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }

}