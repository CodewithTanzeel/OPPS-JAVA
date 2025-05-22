/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adddistance;


public class AddDistance {
   int feet;
   int inches;
   public AddDistance(int feet, int inches){
       this.feet = feet;
       this.inches = inches;
   }
   public AddDistance add(AddDistance d){
       int totalInches = this.inches + d.inches;
       int totalFeet = this.feet + d.feet +(totalInches / 12);
       totalInches = totalInches % 12;
       return new AddDistance(totalFeet,totalInches);  
   }
   public void display(){
       System.out.print(" Distance " + feet + " feet "+ inches + " inches");
   }
   
}

