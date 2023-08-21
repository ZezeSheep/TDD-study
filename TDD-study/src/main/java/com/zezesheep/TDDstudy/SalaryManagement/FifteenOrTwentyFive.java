package com.zezesheep.TDDstudy.SalaryManagement;

public class FifteenOrTwentyFive extends CalculationRule {
    @Override
    protected int limit() {
        return 2500;
    }

    @Override
    protected double percentageAboveLimit() {
        return 0.75;
    }

    @Override
    protected double percentageUnderLimit() {
        return 0.85;
    }
    
}
