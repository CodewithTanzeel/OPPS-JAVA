import java.util.Scanner;

public class Inchtometer{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter value  in incher :");
        int inch = input.nextInt();
        double meter=inch * 0.0254;
        System.out.println("Your entered Value in inches"+inch+ "Your value in meter is"+ meter);

    }
    
}