package com.zezesheep.TDDstudy.SalaryManagement;

public enum Role {
    DEVELOPER(new TenOrTwentyPercent()),
    DBA(new FifteenOrTwentyFive()),
    TESTER(new FifteenOrTwentyFive());

    private CalculationRule rule;

    Role(CalculationRule rule){
        this.rule = rule;
    }

    public CalculationRule getRule(){
        return this.rule;
    }

}
