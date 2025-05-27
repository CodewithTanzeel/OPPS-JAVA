/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usestatic;

/**
 *
 * @author FATTANI COMPUTERS
 */
public class UseStatic {
    static int a = 3;
    static int b;
    static void meth(int x){
        System.out.println("x : "+x);
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        
    }
    public static void main(String[] args) {
        
        System.out.println(UseStatic.a);
                System.out.println(UseStatic.b);
                meth(42);
        
    }
    static {
        System.out.println("Static block Initialized");
        b = a*4;
                
    }
    
}


//Difference between Static initializer block and normal initializer block homework.

