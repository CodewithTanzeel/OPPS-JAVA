/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathematics;

/**
 *
 * @author FATTANI COMPUTERS
 */
public class Mathematics {

    int square(int n){
        return (n*n);
        
    }
    float square(float n){
        return (n * n);
        
    }
    
    public static void main(String[] args) {
        Mathematics num = new Mathematics();
         int res = num.square(3);
         System.out.println("Square of int is: "+ res);
         float res2 = num.square(2.6f);
         System.out.println("Sqaure of float number is :"+res2);
         
        
        
    }
    
}
