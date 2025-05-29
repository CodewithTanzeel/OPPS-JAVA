/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopnumberclass;

class Number{
    int num1;
    int num2;
    void sum(int num1, int num2){
        System.out.print("The total sum of number: "+(num1+num2));
    }
}
public class OOPNumberClass {

    public static void main(String[] args) {
        Number x = new Number();
       
        x.sum(3,4);
        
        
    }
}
