package com.aniamadej;

import com.aniamadej.office.Employee;
import com.aniamadej.office.OfficeWorker;
import com.aniamadej.office.UberBoss;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        OfficeWorker uberBoss = new UberBoss("Uber Boss!");

        OfficeWorker employee1 = new Employee("employee1", uberBoss, BigDecimal.valueOf(100000));
        OfficeWorker employee2 = new Employee("employee2", employee1, BigDecimal.valueOf(90000));
        OfficeWorker employee3 = new Employee("employee3", employee2, BigDecimal.valueOf(80000));
        OfficeWorker employee4 = new Employee("employee4", employee3, BigDecimal.valueOf(50000));
        OfficeWorker employee5 = new Employee("employee5", employee4, BigDecimal.valueOf(10000));

        employee5.payInvoice(BigDecimal.valueOf(10000));
        employee5.payInvoice(BigDecimal.valueOf(10001));
        employee5.payInvoice(BigDecimal.valueOf(50001));
        employee5.payInvoice(BigDecimal.valueOf(80001));
        employee5.payInvoice(BigDecimal.valueOf(90001));
        employee5.payInvoice(BigDecimal.valueOf(100000));
        employee5.payInvoice(BigDecimal.valueOf(100000.01));

        OfficeWorker employee = new Employee("employee", BigDecimal.valueOf(10));

        employee.payInvoice(BigDecimal.valueOf(17));

    }
}
