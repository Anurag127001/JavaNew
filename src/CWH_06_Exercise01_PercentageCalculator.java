//Created by Anurag

import java.util.Scanner;

public class CWH_06_Exercise01_PercentageCalculator {
    public static void main(String[] args)
    {
        System.out.println("Welcome to PyPercentage Calculator");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Total marks : ");
        float totalMarks = s.nextFloat();
        System.out.print("Enter marks in subject 1: ");
        float sub1Marks = s.nextFloat();
        System.out.print("Enter marks in subject 2: ");
        float sub2Marks = s.nextFloat();
        System.out.print("Enter marks in subject 3: ");
        float sub3Marks = s.nextFloat();
        System.out.print("Enter marks in subject 4: ");
        float sub4Marks = s.nextFloat();
        System.out.print("Enter marks in subject 5: ");
        float sub5Marks = s.nextFloat();
        float sum = sub1Marks + sub2Marks + sub3Marks + sub4Marks + sub5Marks;
        float percentage = (sum/(totalMarks*5))*100;
        System.out.println("Your Percentage is "+percentage);
    }
}
