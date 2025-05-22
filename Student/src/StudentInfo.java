/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import student.Student.*;


public class StudentInfo {
        public static void main(String[] args) {
            Student baber = new Student("Baber", 250, "1234556"+ "ISL");
            Student James= new Student("James", 874, "773542"+ "Karachi");
            
            baber.display();
            System.out.println();
            James.display();


        }

}
