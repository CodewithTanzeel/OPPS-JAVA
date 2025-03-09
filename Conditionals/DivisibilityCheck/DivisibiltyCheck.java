package DivisibilityCheck;
import java.util.Scanner;

public class DivisibiltyCheck {
    public static void main(String[] args){
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter on Integer");
        int number = input.nextInt();
        if(number % 5 ==0){
            System.out.println("hiFive");

        }
        if(number % 2 == 0){
            System.out.println("HiEven");
        }
    }

}
