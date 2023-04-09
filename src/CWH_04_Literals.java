public class CWH_04_Literals {
    public static void main(String[] args){
//        Primitive data types

         /*

     1. byte = 1 byte(4bits) integer with min value -128 to 127
     2. short = 2 bytes integer with min value -(2^16)/2 and max. value ((2^16)/2)-1
     3. int = 4 bytes integer with min value -(2^32)/2 and max. value ((2^32)/2)-1
     4. float = 4 bytes (default value 0.0f)
     5. long = 8 bytes integer with min value -(2^64)/2 and max. value ((2^64)/2)-1
     6. double = 8 bytes (default value 0.0d) (if float or double not written then it is by default double)
     7. char = 2 bytes 0 to 65535 ((2^16)-1)
     8. bool = value can be true or false

          */

//   Add Three Numbers
        int num1 = 6;
        int num2 = 5;
        int num3 = 7;
        int sum = num1+num2+num3;
        System.out.println(sum);

        byte age = 18 ;
        char ch = 'A' ;
        float f1 = 5.6f;
        double d1 = 4.66;
        long ageDino = 45666666666L;
        String str = "Anurag";
        System.out.println(str);

    }

}
