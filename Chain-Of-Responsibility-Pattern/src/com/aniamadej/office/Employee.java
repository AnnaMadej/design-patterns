package com.aniamadej.office;

import java.math.BigDecimal;

public class Employee extends OfficeWorker {
    private OfficeWorker boss;
    private BigDecimal maxAmountPayable;

    public Employee(String name, OfficeWorker boss, BigDecimal maxAmountPayable) {
        this(name, maxAmountPayable);
        this.boss = boss;
    }

    public Employee(String name, BigDecimal maxAmountPayable) {
        super(name);
        this.maxAmountPayable = maxAmountPayable;
    }

    @Override
    public void payInvoice(BigDecimal amount) {
        if (this.maxAmountPayable.compareTo(amount) >= 0) {
            this.makePayment(amount);
        } else {
            if (this.boss != null) {
                boss.payInvoice(amount);
            } else {
                this.refusePayment(amount);
            }

        }
    }

}
