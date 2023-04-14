public class CWH_35_Ch7_PS
{

    //Question 1
    static void multiplicanTble(int n)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    //Question 2

    static  void pattern(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //Question 3
    //n=4
   static int sumRec(int n)
   {
        if (n==1)
        {
            return 1;
        }
        return n + sumRec(n-1); // 4+3+2+1+0

   }

    //Question 4

    static  void pattern1(int n)
    {
        for (int i = n; i >= 1; i--)
        {
            for (int j = i; j >=1; j--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    //Question 5
    //fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    static int fib(int n ) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);

        }


    }


        // Question 8
        static void pattern1Rec(int n)
        {
            if (n>0)
            {
                pattern1Rec(n-1  );
                for (int j = 0; j <= n; j++)
                {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }






    public static void main (String[]args) {
//        Answer 1
        multiplicanTble(2);


//       Answer 3
        System.out.println(sumRec(100));

//       Answer 2
        pattern(5);

//        Answer 4
        pattern1(4);


//          Answer 5

        int result = fib(5);
        System.out.println(result);

//          Answer 8
        pattern1Rec(4);





    }
}


