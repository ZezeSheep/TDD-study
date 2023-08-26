package com.zezesheep.TDDstudy.BillProcessor;

import java.util.List;

public class BillProcessor {

    public void process(List<Bill> bills, Invoice invoice) {
        double totalPayed = 0;
        for(Bill bill : bills){
            Payment payment = new Payment(bill.getValue(), PaymentWay.BILL);
            invoice.getPayments().add(payment);
            totalPayed += bill.getValue(); 
        }

        if(totalPayed >= invoice.getValue()){
            invoice.setPayed(true);
        }
    }
    
}
