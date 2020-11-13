package com.aniamadej.office;

import java.math.BigDecimal;

public abstract class OfficeWorker {
    public abstract void payInvoice(BigDecimal amount);

    void makePayment(BigDecimal amount) {
        System.out.println(this.getName() + " has paid: " + amount);
    }

    void refusePayment(BigDecimal amount) {
        System.out.println("Amount of: " + amount + " couldn't have been paid by: " + this.getName());
    }

    private String name;


    public OfficeWorker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
