package com.zezesheep.TDDstudy.SalaryManagement;

public class SalaryCalculator {

    public double executeSalaryCalculus(Worker worker) {
        if(worker.getSalary() > 3000.0){
            return worker.getSalary() * 0.8;    
        }
        else{
            return worker.getSalary() * 0.9;
        }
    }
    
}
