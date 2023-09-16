package org.task.Entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import java.util.Date;

class EmployeeFinancialStatementTest {

    EmployeeFinancialStatement employeeFinancialStatement;
    SalaryList salaryList;

    @BeforeEach
    void setUp() {
        salaryList = new SalaryList(new Date(2000), 1000);
        employeeFinancialStatement = new EmployeeFinancialStatement(
                Collections.singletonList(salaryList));
    }

    @Test
    void calculateTotalAmount() {
        double amount = employeeFinancialStatement.calculateTotalAmount();
        Assertions.assertEquals(1000, amount);
    }

    @Test
    void calculateTotalCount() {
        double count = employeeFinancialStatement.calculateTotalCount();
        Assertions.assertEquals(1, count);
    }
}