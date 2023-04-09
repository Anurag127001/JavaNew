import java.util.Scanner;

public class CWH_13_Strings {
    public static void main(String[] args) {
//        String name = new String("Anurag");
//                  OR
        String name = "Harry";
        System.out.println(name);
//        System.out.printf("The name is: ",name);
        int a = 6;
        float b = 5.65486f;

        System.out.printf("The value of a is %d and value of b is %f. ", a, b);

        /*
                %d for int
                %f for float
                %c for char
                %s for string
         */

        System.out.format("The value of a is %d and value of b is %f ", a, b);

        Scanner sc = new Scanner((System.in));
        String st = sc.nextLine();
        System.out.println(st);


    }
}
