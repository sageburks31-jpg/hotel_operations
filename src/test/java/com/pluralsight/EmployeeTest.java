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
        Employee employee = new Employee(employeeId,name,department,payRate,hoursWorked);

        //act
        employee.punchIn(10);
        //assert - checks hoursWorked in employee is equal to hoursWorked in test
        assertEquals(hoursWorked, employee.getRegularHours());

        //act
        employee.punchout(14);
        //assert - checks hoursWorked in employee is equal to value of (time - startTime)
        assertEquals(10 - 14, employee.getRegularHours());

    }
}