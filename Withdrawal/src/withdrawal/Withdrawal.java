/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package withdrawal;

import java.util.Scanner;

public class Withdrawal {
    
    public static void withdrawAmount(double amount) throws Exception {
        if (amount < 10000) {
            throw new Exception("You are unable to get the requested withdraw amount");
        } else {
            System.out.println("Amount Successfully withdraws");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount you want to withdraw: ");
        double amount = scanner.nextDouble();
        
        try {
            withdrawAmount(amount);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}