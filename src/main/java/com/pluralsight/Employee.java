package com.pluralsight;

import java.time.*;

public class Employee {
    private final int employeeId;
    private final String name;
    private final String department;
    private final double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return (payRate * getRegularHours()) + (payRate * 1.5 * getOvertimeHours());
    }
    public double getRegularHours() {
        double regularHours = 40;
        if (regularHours > hoursWorked) {regularHours = hoursWorked;}
        return regularHours;
    }
    public double getOvertimeHours() {
        double overtimeHour = 0;
        if (hoursWorked - 40 > 0) {overtimeHour = hoursWorked - 40;}
        return overtimeHour;
    }

    public void punchIn() {
        startTime = LocalTime.now().getHour();
    }
    public void punchIn(int time) {
        startTime = time;
    }

    public void punchout() {hoursWorked = LocalTime.now().getHour() - startTime;}
    public void punchout(int time) {hoursWorked = time - startTime;}

    public String toRow() {
        return "employeeId: "+employeeId+" | name: "+name+" | department: "+department+" | hours Worked: "+hoursWorked+" | Total Pay: "+getTotalPay();
    }
}
