package com.zezesheep.TDDstudy.BillProcessor;

import java.util.List;

public class BillProcessor {

    public void process(List<Bill> bills, Invoice invoice) {
        Bill bill = bills.get(0);
        Payment payment = new Payment(bill.getValue(), PaymentWay.BILL);
        invoice.getPayments().add(payment);
    }
    
}
