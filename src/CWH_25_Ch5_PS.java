public class CWH_25_Ch5_PS {
    public static void main(String[] args) {
//        Question 1

//       for (int i=4; i>=1; i=i-1){
//          for (int j=0; j<i; j=j+1){
//              System.out.print("*");
//          }
//           System.out.println("\n");
//       }

//       Question 2
//        int  sum = 0;
//        int n = 10;
//        for(int i = 0; i<n; i++){
//            sum = sum+(2*i);
//        }
//        System.out.printf("Sum of first %d even numbers is: %d", n, sum);

//        Question 3

//        let given number =4
//         int n = 4;
//         for(int i = 1; i<=10; i++){
//             System.out.println(i*n);
//         }


//  `       Question 4
//        int m = 10;
//        for(int i = 10; i>=1; i--){
//            System.out.println(i*m );
//        }



//        Question 6

//        4*3*2*1
//        n * n-1 * n-2 * ... 1
        int n = 5;
        int i = 1;
        int factorial = 1;
        while (i<=n){
            factorial = factorial * i ;
            i++;

        }
        System.out.println(factorial);






    }
}
