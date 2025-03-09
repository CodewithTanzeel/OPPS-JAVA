package AreaofCircle;
import java.util.Scanner;



public class AreaOfCircle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in
        );
        System.out.println("Enter the Value of Radius:");
        int radiusofCircle =input.nextInt();
    if(radiusofCircle > 0 ){
        double areaofCircle = 2*3.142*radiusofCircle;
        System.out.println("Area of Circle:"+areaofCircle);
    }
    }
    
}
