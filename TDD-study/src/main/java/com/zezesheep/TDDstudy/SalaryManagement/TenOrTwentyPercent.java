package com.zezesheep.TDDstudy.SalaryManagement;

public class TenOrTwentyPercent extends CalculationRule {

    @Override
    protected int limit() {
        return 3000;
    }

    @Override
    protected double percentageAboveLimit() {
        return 0.8;
    }

    @Override
    protected double percentageUnderLimit() {
        return 0.9;
    }
    
}
