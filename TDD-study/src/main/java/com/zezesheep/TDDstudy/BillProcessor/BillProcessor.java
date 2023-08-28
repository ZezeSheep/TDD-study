package com.zezesheep.TDDstudy.BillProcessor;

import java.util.List;

public class BillProcessor {

    public void process(List<Bill> bills, Invoice invoice) {
        for(Bill bill : bills){
            Payment payment = new Payment(bill.getValue(), PaymentWay.BILL);
            invoice.addPayment(payment);
        }
    }
    
}
