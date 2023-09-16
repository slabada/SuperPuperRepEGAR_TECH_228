package org.task.Entities;

import java.util.List;

public class EmployeeFinancialStatement {
    List<SalaryList> salaryLists;

    public EmployeeFinancialStatement(List<SalaryList> salaryLists) {
        this.salaryLists = salaryLists;
    }

    public List<SalaryList> getSalaryLists() {
        return salaryLists;
    }

    // Сумма ЗП сотрудника
    public double calculateTotalAmount() {
        return salaryLists.stream().mapToDouble(SalaryList::getAmount).sum();
    }

    // Количество ЗП сотрудника
    public int calculateTotalCount() {
        return salaryLists.size();
    }
}
