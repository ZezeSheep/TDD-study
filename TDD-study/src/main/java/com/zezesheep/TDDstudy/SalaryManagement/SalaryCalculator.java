package com.zezesheep.TDDstudy.SalaryManagement;

public class SalaryCalculator {

    public double executeSalaryCalculus(Worker worker) {
        if(worker.getRole().equals(Role.DEVELOPER)){
            return tenOrTwelvePercentDiscount(worker);
        }
        else if(worker.getRole().equals(Role.DBA) || worker.getRole().equals(Role.TESTER)){
            return fifteenOrTweentyFivePercentDicount(worker);
        }
        else{
            throw new RuntimeException("Invalid worker");
        }
    }

    private double tenOrTwelvePercentDiscount(Worker worker) {
        if(worker.getSalary() > 3000.0){
            return worker.getSalary() * 0.8;    
        }
        else{
            return worker.getSalary() * 0.9;
        }
    }

    private double fifteenOrTweentyFivePercentDicount(Worker worker) {
        if(worker.getSalary() < 2500.0){
            return worker.getSalary() * 0.85;    
        }
        else{
            return worker.getSalary() * 0.75;
        }
    }
    
}
