package com.zezesheep.TDDstudy.ShoppingCart;

public class HighestPrice {

    public double find(ShoppingCart shoppingCart){
        if(shoppingCart.getItems().size() == 0) return 0;

        double maior = shoppingCart.getItems().get(0).getTotalValue();
        for(ShoppingItem item : shoppingCart.getItems()){
            if(maior < item.getTotalValue()){
                maior = item.getTotalValue();
            }
        }
        return maior;
    }
    
}
