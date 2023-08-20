package com.zezesheep.TDDstudy.SalaryManagement;

public class TenOrTwentyPercent implements CalculationRule {

    @Override
    public double calculate(Worker worker) {
        if(worker.getSalary() > 3000.0){
            return worker.getSalary() * 0.8;    
        }
        else{
            return worker.getSalary() * 0.9;
        }
    }
    
}
