/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisionexample;

public class DivisionExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        try {
            int result = numerator / denominator;
            System.out.println("Result:" + result);
        } 
        catch (ArithmeticException e) {
           
            System.out.println("Cannot divide by zero.");
        } 
        finally {
            System.out.println("Finally block executed.");
        }
    }
}