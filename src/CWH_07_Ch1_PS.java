import java.util.Scanner;

public class CWH_07_Ch1_PS {
    public static void main(String[] args)
    {
//        Question 1
        int a = 45;
        int b = 17;
        int c = 6;
        System.out.println("The sum is "+ (a+b+c));


//        Question 2
        float sub1 = 45;
        float sub2 = 95;
        float sub3 = 48;
        float cgpa = (sub1+sub2+sub3)/30;
        System.out.println("CGPA: "+cgpa);

//        Question 3
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = s.nextLine();
        System.out.println("Hello, "+name +"!, Have a good Day!");

//        Question 4


        Scanner m = new Scanner(System.in);
        System.out.print("Enter Kilometers: ");
        double kiloMtrs = m.nextDouble();

        double miles = (kiloMtrs * 0.621371);

        System.out.println(miles+" miles.");



//      Question 5

        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        boolean e = n.hasNextInt();

        System.out.println("Is the entered number is integer? "+ e);



    }


}
