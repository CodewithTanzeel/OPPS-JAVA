package AttendenceEvaluation;
import java.util.Scanner;
public class AttendenceEvaluation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Total no of Classes: ");
        int TotalClasses = input.nextInt();
        System.out.println("Enter Your Total no of Classes that u attended : ");
        int TotalClassesAttended=input.nextInt();
        
        double percentage = ((TotalClassesAttended/TotalClasses)*100);
        System.out.println("Total no of classes were"+TotalClasses+"and the no of classes i attended were"+TotalClassesAttended+"my Attendence Percentage is"+percentage);

        if( percentage >= 75){
            System.out.print("you are allowed to attend classes");
        } else{
            System.out.print("You arent Allowed to attend classes");
        }

            }
}