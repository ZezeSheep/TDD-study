package com.zezesheep.TDDstudy.SalaryManagement;

public class SalaryCalculator {

    public double executeSalaryCalculus(Worker worker) {
        if(worker.getRole().equals(Role.DEVELOPER)){
            if(worker.getSalary() > 3000.0){
                return worker.getSalary() * 0.8;    
            }
            else{
                return worker.getSalary() * 0.9;
            }
        }
        else if(worker.getRole().equals(Role.DBA) || worker.getRole().equals(Role.TESTER)){
            if(worker.getSalary() < 2500.0){
                return worker.getSalary() * 0.85;    
            }
            else{
                return worker.getSalary() * 0.75;
            }
        }
        else{
            throw new RuntimeException("Invalid worker");
        }
    }
    
}
