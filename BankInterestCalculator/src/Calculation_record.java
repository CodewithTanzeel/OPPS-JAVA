/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import bank_account.Calculate_interest;
import bank_account.Calculate_special_Interest;

public class Calculation_record {
    public static void main(String[] args) {
        double customerAmount = 5000.0;
        double employeeAmount = 5000.0;
        double interestRate = 7.5; // 7.5% interest rate
        Calculate_interest customer = new Calculate_interest();
        Calculate_special_Interest employee = new Calculate_special_Interest();
        double customerInterest = customer.calculateAmount(customerAmount, interestRate);
        double employeeInterest = employee.calculateAmount(employeeAmount, interestRate);
      
        System.out.println("Interest Calculation Record ");
        System.out.printf("Customer Amount: $%.2f%n", customerAmount);
        System.out.printf("Customer Interest (%.2f%%): $%.2f%n", interestRate, customerInterest);
        System.out.println();
        System.out.printf("Employee Amount: $%.2f%n", employeeAmount);
        System.out.printf("Employee Special Interest (%.2f%%): $%.2f%n", interestRate, employeeInterest);
       
    }
}
