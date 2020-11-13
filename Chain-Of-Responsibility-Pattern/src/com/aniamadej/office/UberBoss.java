package com.aniamadej.office;

import java.math.BigDecimal;

public class UberBoss extends OfficeWorker {


    public UberBoss(String name) {
        super(name);
    }

    @Override
    public void payInvoice(BigDecimal amount) {
        this.makePayment(amount);
    }


}
