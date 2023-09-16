package org.task.Entities;

import java.util.Date;

public class SalaryList {
    private Date dateTime;
    private double amount;

    public SalaryList(Date dateTime, double amount) {
        this.dateTime = dateTime;
        this.amount = amount;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public double getAmount() {
        return amount;
    }
}
