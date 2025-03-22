
 import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter no 1 : ");
        int No1 = input.nextInt();
        System.out.print("Enter no 2 : ");
        int No2 = input.nextInt();
        int sum = No1 + No2;
        System.out.println("The sum is "+ sum );
        int difference = No1 - No2;
        System.out.println("The difference is "+ difference );

    }
}