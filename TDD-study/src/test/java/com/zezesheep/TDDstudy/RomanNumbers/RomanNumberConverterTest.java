package com.zezesheep.TDDstudy.RomanNumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumberConverterTest {

    @Test
    public void mustUnderstandSymbolI(){
        RomanNumberConverter romanConverter = new RomanNumberConverter();

        int number = romanConverter.convert("I");
        assertEquals(1, number);
    }

    @Test
    public void mustUnderstandSymbolV(){
        RomanNumberConverter romanConverter = new RomanNumberConverter();

        int number = romanConverter.convert("V");
        assertEquals(5, number);
    }

    @Test
    public void mustUnderstandTwoSymbolsLikeII(){
        RomanNumberConverter romanConverter = new RomanNumberConverter();

        int number = romanConverter.convert("II");
        assertEquals(2, number);

    }

    @Test
    public void mustUnderstandFourSymbolsLikeXXII(){
        RomanNumberConverter romanConverter = new RomanNumberConverter();

        int number = romanConverter.convert("XXII");
        assertEquals(22, number);

    }

    @Test
    public void mustUnderstandSymbolsLikeIX(){
        RomanNumberConverter romanConverter = new RomanNumberConverter();

        int number = romanConverter.convert("IX");
        assertEquals(9, number);

    }

    @Test
    public void mustUnderstandComplexSequencesLikeXXIV(){
        RomanNumberConverter romanConverter = new RomanNumberConverter();

        int number = romanConverter.convert("XXIV");
        assertEquals(24, number);

    }

    
}
