package com.zezesheep.TDDstudy.ShoppingCart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart;

    @BeforeEach
    public void initialize(){
        this.shoppingCart = new ShoppingCart();
    }


    @Test
    public void mustReturnZeroIfCartIsEmpty(){
        assertEquals(0.0, shoppingCart.highestValue(), 0.0001);
    }

    @Test
    public void mustReturnValueOfItemIfCartWithOneElement(){

        shoppingCart.addItem(new ShoppingItem("Freezer", 1, 900.0));
        
        assertEquals(900.0, shoppingCart.highestValue(), 0.0001);
    }

    @Test
    public void mustReturnValueIfCartWithLotsOfItems(){

        shoppingCart.addItem(new ShoppingItem("Freezer", 1, 900.0));
        shoppingCart.addItem(new ShoppingItem("Stove", 1, 1500.0));
        shoppingCart.addItem(new ShoppingItem("Washing Machine", 1, 750.0));
        
        assertEquals(1500.0, shoppingCart.highestValue(), 0.0001);
    }
    
}
