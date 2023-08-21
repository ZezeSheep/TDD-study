package com.zezesheep.TDDstudy.SalaryManagement;

public abstract class CalculationRule {

    public double calculate(Worker worker){
        if(worker.getSalary() > limit()){
            return worker.getSalary() * percentageAboveLimit();
        }
        else{
            return worker.getSalary() * percentageUnderLimit();
        }
    }

    protected abstract int limit();

    protected abstract double percentageAboveLimit();

    protected abstract double percentageUnderLimit();
    
}
