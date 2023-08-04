package com.zezesheep.TDDstudy.SalaryManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SalaryCalculatorTest {

    @Test
    public void mustCalculateSalaryForDevelopersWithSalaryUnderTheEdge(){

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        Worker developer = new Worker("Mauricio", 1500.0, Role.DEVELOPER);

        double salary = salaryCalculator.executeSalaryCalculus(developer);

        assertEquals(1500.0 * 0.9, salary, 0.00001);

    }

    @Test
    public void mustCalculateSalaryForDevelopersWithSalaryAboveTheEdge(){

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        Worker developer = new Worker("Mauricio", 4000.0, Role.DEVELOPER);

        double salary = salaryCalculator.executeSalaryCalculus(developer);

        assertEquals(4000.0 * 0.9, salary, 0.00001);

    }
    
}
