/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classrectangle;

/**
 *
 * @author FATTANI COMPUTERS
 */
public class ClassRectangle {
    int length;
    int width;
    
    ClassRectangle(int l,int w){
        this.length = l;
        this.width = w;
    }
    int calculateArea( ){
        return (length * width);
       
   }
   
    public static void main(String[] args) {
        ClassRectangle shape = new ClassRectangle(5,4);
        int result = shape.calculateArea();
        System.out.println("The Calculated Area is "+result);
        
    }
    
}
