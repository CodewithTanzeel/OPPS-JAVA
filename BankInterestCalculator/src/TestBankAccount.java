/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import bank_account.Calculate_interest;
import bank_account.Calculate_special_Interest;

public class TestBankAccount {
    public static void main(String[] args) {
        // Customer interest
        Calculate_interest customer = new Calculate_interest();
        double customerInterest = customer.calculateAmount(1000, 5);
        System.out.println("Customer Interest: $" + customerInterest);
        
        // Employee interest
        Calculate_special_Interest employee = new Calculate_special_Interest();
        double employeeInterest = employee.calculateAmount(1000, 5);
        System.out.println("Employee Special Interest: $" + employeeInterest);
    }
}