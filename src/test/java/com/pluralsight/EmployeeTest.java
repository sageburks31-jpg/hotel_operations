package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void employee_should_punchIn_and_punchOut() {
        int employeeId = 0;
        String name = "";
        String department = "";
        double payRate = 0;
        double hoursWorked = 0;
        double startTime;
        Employee employee = new Employee(employeeId,name,department,payRate,hoursWorked);

        //act
        employee.punchIn(1);
        //assert

        //act
        employee.punchout(8);
        //assert

    }
}