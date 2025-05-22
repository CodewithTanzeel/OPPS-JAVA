/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;


public class Student {
    int rollNumber;
    String phoneNumber;
    String address;
    String name;
    
    public Student(String name,int rollNumber,String phoneNumber,String address){
        this.name = name;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Roll Number: "+ rollNumber);
        System.out.println("Phone Number: "+ phoneNumber); 
        System.out.println("Address: "+ address);        
    }  
}
