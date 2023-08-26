package com.zezesheep.TDDstudy.Invoice;

public interface AfterInvoiceGenerated {
    void execute(Invoice invoice);
}
