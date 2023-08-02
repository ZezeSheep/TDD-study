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
        for(int i = 0; i < numberInRoman.length(); i++){
            sum += table.get(numberInRoman.charAt(i));
        }
        return sum;
    }
    
}
