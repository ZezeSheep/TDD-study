package com.zezesheep.TDDstudy.Invoice;

import java.util.Calendar;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Invoice {

    private String client;
    private double value;
    private Calendar date;
    
}
