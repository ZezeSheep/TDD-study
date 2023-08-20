package com.zezesheep.TDDstudy.SalaryManagement;

public class FifteenOrTwentyFive implements CalculationRule {

    @Override
    public double calculate(Worker worker) {
        if(worker.getSalary() < 2500.0){
            return worker.getSalary() * 0.85;    
        }
        else{
            return worker.getSalary() * 0.75;
        }
    }
    
}
