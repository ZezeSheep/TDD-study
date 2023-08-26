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
    
}
