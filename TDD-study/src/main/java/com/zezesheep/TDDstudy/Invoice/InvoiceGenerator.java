package com.zezesheep.TDDstudy.Invoice;

import java.util.Calendar;

public class InvoiceGenerator {

    public Invoice generate(Order order) {
        return new Invoice(order.getClient(), order.getTotalValue() * 0.94, Calendar.getInstance());
    }
    
}
