package com.zezesheep.TDDstudy.SalaryManagement;

public class SalaryCalculator {

    public double executeSalaryCalculus(Worker developer) {
        if(developer.getSalary() > 3000.0) return 3200.0;
        return 1350.0;
    }
    
}
