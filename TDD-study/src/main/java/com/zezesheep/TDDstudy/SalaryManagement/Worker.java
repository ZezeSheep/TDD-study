package com.zezesheep.TDDstudy.SalaryManagement;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Worker {

    private String name;
    private double salary;
    private Role role;
    
}
