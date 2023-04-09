import java.util.Scanner;

public class CWH_18_SwitchCase {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
//
//        if (age > 56){
//            System.out.println("You are Experienced");
//        }
//        else if (age > 46){
//            System.out.println("You are Semi-Experienced");
//        }
//        else if (age > 36){
//            System.out.println("You are Semi-semi-Experienced");
//        }
//        else {
//            System.out.println("You are Not-Experienced");
//        }
//

//      Switch case Statements:

//        switch (age){
//            case 18:
//                System.out.println("You are going to become and adult");
//                break;
//            case 23:
//                System.out.println("You are going to join a job");
//                break;
//            case 60:
//                System.out.println("You are going to get retired");
//                break;
//            default:
//                System.out.println("Enjoy your life");



//                ENHANCED SWITCH

        switch (age) {
            case 18 -> System.out.println("You are going to become and adult");
            case 23 -> System.out.println("You are going to join a job");
            case 60 -> System.out.println("You are going to get retired");
            default -> System.out.println("Enjoy your life");
        }






    }
}
