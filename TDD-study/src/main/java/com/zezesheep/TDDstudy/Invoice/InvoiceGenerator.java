package com.zezesheep.TDDstudy.Invoice;

import java.util.Calendar;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class InvoiceGenerator {

    private List<AfterInvoiceGenerated> afterInvoiceGenerationActions;
    private Table table;

    public Invoice generate(Order order) {
        Invoice invoice = new Invoice(
            order.getClient(), 
            order.getTotalValue() * table.getByValue(order.getTotalValue()), 
            Calendar.getInstance());

        for(AfterInvoiceGenerated afterInvoiceGenerated : afterInvoiceGenerationActions){
            afterInvoiceGenerated.execute(invoice);
        }
        return invoice;
    }
    
}
