package com.zezesheep.TDDstudy.BillProcessor;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class InvoiceTest {

    @Test
    public void mustMarkInvoiceAsPaidIfSingleBillPaysEverything(){
        BillProcessor billProcessor = new BillProcessor();

        Invoice invoice = new Invoice("Client", 150.0);
        Bill b1 = new Bill(150.0);
        List<Bill> bills = new ArrayList<>();
        bills.add(b1);

        billProcessor.process(bills, invoice);


        assertTrue(invoice.isPayed());
    }
    

    @Test
    public void mustMarkInvoiceAsNotPaidIfSingleBillDoesntPayEverything(){
        BillProcessor billProcessor = new BillProcessor();

        Invoice invoice = new Invoice("Client", 150.0);
        Bill b1 = new Bill(140.0);
        List<Bill> bills = new ArrayList<>();
        bills.add(b1);

        billProcessor.process(bills, invoice);


        assertFalse(invoice.isPayed());
    }

    @Test
    public void mustMarkInvoiceAsPaidIfSeveralBillsPayEverything(){
        BillProcessor billProcessor = new BillProcessor();

        Invoice invoice = new Invoice("Client", 150.0);
        Bill b1 = new Bill(140.0);
        Bill b2 = new Bill(50.0);
        List<Bill> bills = new ArrayList<>();
        bills.add(b1);
        bills.add(b2);

        billProcessor.process(bills, invoice);


        assertTrue(invoice.isPayed());
    }

    @Test
    public void mustMarkInvoiceAsNotPaidIfSeveralBillsNotPayEverything(){
        BillProcessor billProcessor = new BillProcessor();

        Invoice invoice = new Invoice("Client", 600.0);
        Bill b1 = new Bill(140.0);
        Bill b2 = new Bill(50.0);
        List<Bill> bills = new ArrayList<>();
        bills.add(b1);
        bills.add(b2);
        
        billProcessor.process(bills, invoice);


        assertFalse(invoice.isPayed());
    }


    
}
