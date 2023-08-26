package com.zezesheep.TDDstudy.Invoice;

public class InvoiceDao implements AfterInvoiceGenerated {

    private void persist(Invoice invoice){
        // persiste invoice
    }

    @Override
    public void execute(Invoice invoice) {
        persist(invoice);
    }
    
}
