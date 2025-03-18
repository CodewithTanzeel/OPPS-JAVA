import java.util.Scanner;

public class DaysConverter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter days  :");
        double days = input.nextInt();
        // for months into days / 30 .
        double months = days/30.44;
        double remainigdays = days-(months*30.44);

        System.out.println("you Have "+months+ "Months and days are" + days);


    }
}