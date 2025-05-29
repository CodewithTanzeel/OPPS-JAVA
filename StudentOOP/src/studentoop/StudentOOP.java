/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentoop;

/**
 *
 * @author FATTANI COMPUTERS
 */
public class StudentOOP {

    String Name;
    int rollNo;
    int phoneNO;
    String Address;
    
    void DisplayStudentInfo(){
        System.out.println("Student Name is :"+ Name);
        System.out.println("Student RollNo is :"+ rollNo);
        System.out.println("Student Contact is :"+ phoneNO);
        System.out.println("Student Address is :"+ Address);
        
    }
    public static void main(String[] args) {
        StudentOOP stu1  = new StudentOOP();
        stu1.Name = "Baber";
        stu1.rollNo = 2024192;
        stu1.phoneNO = 92232563;
        stu1.Address = "Gulistan";
        stu1.DisplayStudentInfo();
        
        StudentOOP stu2 = new StudentOOP();
        stu2.Name="Danish";
        stu2.rollNo = 2024195;
        stu2.phoneNO = 923541986;
        stu2.Address = "Houston Texas";
        stu2.DisplayStudentInfo();
    
}
}

