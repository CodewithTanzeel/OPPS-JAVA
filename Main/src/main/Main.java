package main;
interface Shape {
    void draw();
}
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a Circle");
    }
}
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a Square");
    }
}
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a Rectangle");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape rectangle = new Rectangle();
        circle.draw();    
        square.draw();   
        rectangle.draw();
        Shape[] shapes = {new Circle(), new Square(), new Rectangle()};
        for (Shape shape : shapes) {
            shape.draw(); 
        }
    }
}
//interface Y {
//    void mull();
//}
//interface X extends Y {
//    void add();
//    void sub();
//}
//class A implements X {
//    @Override
//    public void add() {
//        System.out.println("Adding in class A");
//    }
//    @Override
//    public void sub() {
//        System.out.println("Subtracting in class A");
//    }
//   @Override
//    public void mull() {
//        System.out.println("Multiplying in class A");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A obj = new A();
//        obj.add();  
//        obj.sub();  
//        obj.mull();  
//        X xRef = new A();
//        xRef.add();
//        xRef.sub();
//        xRef.mull(); 
//        Y yRef = new A();
//        yRef.mull(); 
//    }
//}
//abstract class Shape {
//    public abstract double calculateArea();
//}
//class Circle extends Shape {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//    @Override
//    public double calculateArea() {
//        return Math.PI * radius * radius;
//    }
//}
//class Rectangle extends Shape {
//    private double length;
//    private double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//    @Override
//    public double calculateArea() {
//        return length * width;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Shape circle = new Circle(5);
//        System.out.println("Area of Circle: " + circle.calculateArea());
//        Shape rectangle = new Rectangle(2, 6);
//        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
//    }
//}
