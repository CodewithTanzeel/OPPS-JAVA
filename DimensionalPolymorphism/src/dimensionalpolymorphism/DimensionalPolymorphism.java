/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dimensionalpolymorphism;


public class DimensionalPolymorphism {
   double dim1;
   Figure(){
       this.dim1 = -1;
       
   }
   Figure(double dim1){
       this.dim1 = dim1;
       
   }
   void area(){
       System.out.println("area is undefined");
   }
   public String toString(){
      return "Dim1 = "+this.dim1;
   }
    
}
