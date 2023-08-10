package com.zezesheep.TDDstudy.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCart {

    private List<ShoppingItem> items = new ArrayList<>();

    public void addItem(ShoppingItem shoppingItem){
        this.items.add(shoppingItem);
    }
    
}
