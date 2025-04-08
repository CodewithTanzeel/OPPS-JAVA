import java.util.Scanner;

public class SquareCheck{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter length: ");
       int length = input.nextInt();
       System.out.print("Enter Breath");
       int breath = input.nextInt();
       if (breath == length){
           System.out.print("It is a Square");
           
       }
       else{
          System.out.print("It is not a Square");
    }
}
}