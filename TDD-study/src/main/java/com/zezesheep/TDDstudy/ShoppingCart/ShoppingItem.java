package com.zezesheep.TDDstudy.ShoppingCart;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ShoppingItem {

    private String description;
    private int quantity;
    private double unityPrice;

    public double getTotalValue(){
        return unityPrice * quantity;
    }
    
}
