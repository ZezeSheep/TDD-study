package com.zezesheep.TDDstudy.BillProcessor;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Invoice {

    private String client;
    private double value;
    private List<Payment> payments;
    private boolean payed;

    public Invoice(String client, double value){
        this.client = client;
        this.value = value;
        this.payments = new ArrayList<>();
        this.payed = false;
    }

    public void addPayment(Payment payment){
        payments.add(payment);

        double totalValue = 0;
        for(Payment paymentItem : payments){
            totalValue+=paymentItem.getValue();
        }

        if(totalValue >= value){
            payed = true;
        }
    }
    
}
