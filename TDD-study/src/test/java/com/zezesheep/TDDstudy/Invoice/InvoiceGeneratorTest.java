package com.zezesheep.TDDstudy.Invoice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {

    @Test
    public void mustGenerateInvoiceWithTaxesValueIncluded(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        Order order = new Order("Mauricio", 1000, 1);

        Invoice invoice = invoiceGenerator.generate(order);

        assertEquals(1000 * 0.94, invoice.getValue(), 0.0001);
    }
    
}
