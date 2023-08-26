package com.zezesheep.TDDstudy.Invoice;

public class SAP implements AfterInvoiceGenerated {

    private void send(Invoice invoice){
        // send invoice to SAP
    }

    @Override
    public void execute(Invoice invoice) {
        send(invoice);
    }
    
}
