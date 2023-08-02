package com.zezesheep.TDDstudy.RomanNumbers;

public class RomanNumberConverter {

    public int convert(String numberInRoman) {
        if(numberInRoman.equals("I")) return 1;
        else if(numberInRoman.equals("V")) return 5;
        return 0;
    }
    
}
