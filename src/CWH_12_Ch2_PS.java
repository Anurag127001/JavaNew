import java.util.Scanner;

public class CWH_12_Ch2_PS {

    public static void main(String[] args) {
//        Question 1
        float z = 7/4.0f * 9/2.0f;
//       = 1.75*9
//       = 15.75/2
//       = 7.875
        System.out.println(z);

//        Question 2

//        Encrypting grade
                char grade = 'B';
        grade = (char)(grade + 8 );
        System.out.println(grade);

//        Decrypting grade
        grade = (char)(grade - 8 );
        System.out.println(grade);


//        Question 3
        Scanner sc = new Scanner(System.in);
        int given_number = 8;
        System.out.println("Enter a number here: ");
        float f = sc.nextFloat();
        boolean bool = given_number > f;
        System.out.println("The given number(8) is greater than user entered number ?" + bool);

//        Question 4
        float v = 8;
        float u = 4;
        float a = 2;
        float s = 6;

        float b = (v*v - u*u)/2*a*s;
        System.out.println(b);


    }
}
