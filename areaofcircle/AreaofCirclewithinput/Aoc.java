import java.util.Scanner;

public class Aoc{
    public static void main(String[] args){
        double area;
        double radius;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Radius of a circle:");
        radius = obj.nextDouble();
        area = radius*radius*3.142;
        System.out.println("Area of Circle is :"+area);


    }
}