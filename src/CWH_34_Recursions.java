public class CWH_34_Recursions {


    // A function in java can call itself. Such calling of function is called recurssion
//    factorial 0 = 1
//    factorial n * n-1 * ...1
//    factorial(5) = 5*4*3*2*1 =120
//    factorial(n) = n * factorial(n-1)


    //Recurssive Approach
    static int factorial(int n){
          if (n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
           }


    //Itterative Approach
    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    //Fibonacci series 0, 1, 1, 2, 3, 5, 8, 13, 21
//    static int fibonacci() {
//        int i = 1;
////        int j = 0;
//        while (i <= 10) {
//            i = ;
//            i++;
//            System.out.println(j);
//        }
//    }













    public static void main(String[] args) {
        System.out.println("The value of factorial of 5 is : "+ factorial(5));
        System.out.println("The value of factorial of 4 using iterative loop is: " + factorial_iterative(4));
//        System.out.printf("Fibonaci Series upto 10 is %d ", fibonacci());
    }
}
