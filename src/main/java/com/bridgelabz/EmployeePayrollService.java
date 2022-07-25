package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList){
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner sc = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(sc);
        employeePayrollService.writeEmployeePayrollData();
    }

    /**
     * This method reads the data from user
     * @param sc input from console
     */
    public void readEmployeePayrollData(Scanner sc) {
        System.out.print("Enter your ID number : ");
        int id = sc.nextInt();
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.print("Enter your salary : ");
        double salary = sc.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id,name,salary));
    }

    /**
     * This method writes the user data in console
     */
    public void writeEmployeePayrollData(){
        System.out.println("\n Writing Employee Payroll Roaster to Console\n" + employeePayrollList);
    }
}