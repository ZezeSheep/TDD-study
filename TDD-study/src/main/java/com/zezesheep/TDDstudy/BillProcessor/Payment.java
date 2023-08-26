package com.zezesheep.TDDstudy.BillProcessor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payment {

    private double value;
    private PaymentWay paymentWay;


    
}
