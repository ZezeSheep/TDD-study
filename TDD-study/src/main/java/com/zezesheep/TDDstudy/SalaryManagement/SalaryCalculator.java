package com.zezesheep.TDDstudy.SalaryManagement;

public class SalaryCalculator {

    public double executeSalaryCalculus(Worker worker) {
        return worker.getRole().getRule().calculate(worker);
    }

    
}
