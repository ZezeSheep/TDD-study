package com.zezesheep.TDDstudy.Invoice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

    private String client;
    private double totalValue;
    private int quantityItems;
    
}
