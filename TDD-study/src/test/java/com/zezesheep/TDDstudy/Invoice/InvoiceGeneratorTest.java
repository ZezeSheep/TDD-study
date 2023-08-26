package com.zezesheep.TDDstudy.Invoice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class InvoiceGeneratorTest {

    @Test
    public void mustEvokePostActions(){
        AfterInvoiceGenerated action1 = Mockito.mock(AfterInvoiceGenerated.class);
        AfterInvoiceGenerated action2 = Mockito.mock(AfterInvoiceGenerated.class);

        Table table = Mockito.mock(Table.class);
        Mockito.when(table.getByValue(1000.0)).thenReturn(0.2);

        List<AfterInvoiceGenerated> listOfActions = new ArrayList<>();
        listOfActions.add(action1);
        listOfActions.add(action2);

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(listOfActions, table);

        Order order = new Order("Mauricio", 1000, 1);

        Invoice invoice = invoiceGenerator.generate(order);

        Mockito.verify(action1).execute(invoice);
        Mockito.verify(action2).execute(invoice);
    }

    @Test
    public void mustGetInformationFromTable(){
        Table table = Mockito.mock(Table.class);

        Mockito.when(table.getByValue(1000.0)).thenReturn(0.2);

        List<AfterInvoiceGenerated> listOfActions = Collections.emptyList();

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(listOfActions, table);

        Order order = new Order("Mauricio", 1000, 1);

        Invoice invoice = invoiceGenerator.generate(order);

        Mockito.verify(table).getByValue(1000.0);
        assertEquals(1000.0*0.2, invoice.getValue(), 0.00001);
        
    }

    
}
