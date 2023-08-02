package com.zezesheep.TDDstudy.RomanNumbers;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberConverter {

    private static Map<Character, Integer> table = 
        new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

    public int convert(String numberInRoman) {
        int sum = 0;
        int lastRightNumber = 0;
        for(int i = numberInRoman.length() - 1; i >= 0; i--){
            int current = table.get(numberInRoman.charAt(i));

            int multiplier = 1;
            if(current < lastRightNumber) multiplier = -1;

            sum = sum + current * multiplier;
            
            lastRightNumber = current;
            
        }
        return sum;
    }
    
}
