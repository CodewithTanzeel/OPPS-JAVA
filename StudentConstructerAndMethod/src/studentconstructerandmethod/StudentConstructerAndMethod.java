/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentconstructerandmethod;

/**
 *
 * @author FATTANI COMPUTERS
 */
public class StudentConstructerAndMethod {
  String Name;
  int RollNo;
  float Gpa;
  int Semester;
  
  StudentConstructerAndMethod(String n, int r,float g ,int s){
      this.Name = n;
      this.RollNo = r;
      this.Semester = s;
      this.Gpa = g;
  }
  
   void Display(){

      System.out.println("my Name is : "+Name);
      System.out.println("my rollNo  is : "+RollNo);
      System.out.println("my Gpa is : "+Semester);
      System.out.println("my semster is : "+Gpa);
      
}
    public static void main(String[] args) {
        StudentConstructerAndMethod  stu = new StudentConstructerAndMethod("Ali",3425,3.6f,3);
        stu.Display();
        
    }
    
}
