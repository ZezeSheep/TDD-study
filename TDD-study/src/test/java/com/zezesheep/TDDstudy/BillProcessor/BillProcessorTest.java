package com.zezesheep.TDDstudy.BillProcessor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BillProcessorTest {

    @Test
    public void mustProcessPaymentBySingleBill(){
        BillProcessor billProcessor = new BillProcessor();

        Invoice invoice = new Invoice("Client", 150.0);
        Bill b1 = new Bill(150.0);
        List<Bill> bills = new ArrayList<>();
        bills.add(b1);

        billProcessor.process(bills, invoice);


        assertEquals(1, invoice.getPayments().size());
        assertEquals(150.0, invoice.getPayments().get(0).getValue(), 0.00001);
    }

    @Test
    public void mustProcessPaymentBySeveralBills(){
        BillProcessor billProcessor = new BillProcessor();

        Invoice invoice = new Invoice("Client", 150.0);
        Bill b1 = new Bill(150.0);
        Bill b2 = new Bill(200.0);
        List<Bill> bills = new ArrayList<>();
        bills.add(b1);
        bills.add(b2);

        billProcessor.process(bills, invoice);


        assertEquals(2, invoice.getPayments().size());
        assertEquals(150.0, invoice.getPayments().get(0).getValue(), 0.00001);
        assertEquals(200.0, invoice.getPayments().get(1).getValue(), 0.00001);
    }

}
