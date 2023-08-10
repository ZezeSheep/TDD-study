package com.zezesheep.TDDstudy.ShoppingCart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HighestPriceTest {

    @Test
    public void mustReturnZeroIfCartIsEmpty(){
        ShoppingCart shoppingCart = new ShoppingCart();

        HighestPrice algorithm = new HighestPrice();

        double value = algorithm.find(shoppingCart);
        
        assertEquals(0.0, value, 0.0001);
    }

    @Test
    public void mustReturnValueOfItemIfCartWithOneElement(){

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new ShoppingItem("Freezer", 1, 900.0));

        HighestPrice algorithm = new HighestPrice();

        double value = algorithm.find(shoppingCart);
        
        assertEquals(900.0, value, 0.0001);
    }
    
}
