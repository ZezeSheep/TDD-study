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

    public double highestValue(){
        if(items.size() == 0) return 0;

        double maior = items.get(0).getTotalValue();
        for(ShoppingItem item : items){
            if(maior < item.getTotalValue()){
                maior = item.getTotalValue();
            }
        }
        return maior;
    }
    
}
