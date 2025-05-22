/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import adddistance.*;

public class DisatanceMain {
    
    public static void main(String[] args) {
        AddDistance d1 = new AddDistance(10,33);
        AddDistance d2 = new AddDistance(77,222);
        AddDistance result  = d1.add(d2);
        result.display();
    }

    
}
