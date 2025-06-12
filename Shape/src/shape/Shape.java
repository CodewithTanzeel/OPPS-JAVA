/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

abstract class Shape {
   
    public abstract double calculateArea();
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
public class Main {
    public static void main(String[] args) {
        // Create a Circle with radius 5
        Shape circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Create a Rectangle with length 4 and width 6
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}






//public class Shape {
//    int dim1;
//    int dim2;
//    
//    Shape(int d1,int d2){
//        this.dim1 = d1;
//        this.dim2 = d2;
//        
//    }
//    Shape(int d1){
//        this.dim1 = d1;
//        
//        
//    }
//    
//    int areaofSquare( ){
//        return (dim1*dim1);
//        
//    }
//    int areaofReactangle(){
//        return (dim1*dim2);
//    }
//    public static void main(String[] args) {
//       Shape reactangle = new Shape(8,4);
//       int  result = reactangle.areaofReactangle();
//       System.out.println("The total Area of your reactangle is :"+result);
//       Shape square= new Shape(4);
//       int resultS= square.areaofSquare();
//       System.out.println("The total are of a Square is :"+ resultS);
//       
//       
//       
//       
//       
//       
//       
//    }
//    
//}
