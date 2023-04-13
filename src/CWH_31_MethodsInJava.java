public class CWH_31_MethodsInJava {
//    The code is a function that takes two integers as input and returns an integer.
//    The code starts by declaring the variables x, y, z, c1.
//    It then declares logic(int x, int y) which is a function that calculates the value of z based on its inputs (x and y).
//    Next it declares if (x>y), which checks to see if x is greater than or equal to y.
//    If so then it assigns z = x+y; otherwise it assigns z = (x+y)*5; finally returning the calculated value of z back to main().
    static  int logic(int x, int y){
        int z;
        if (x>y){
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {

        int a1 = 2;
        int b1 = 1;
        int c1;


        //Method invocation using Object creation
//        CWH_31_MethodsInJava obj = new CWH_31_MethodsInJava();
//        c1 = obj.logic(a1,b1);
        c1 = logic(a1, b1);
        System.out.println(c1);




        // OR


        int a = 5;
        int b = 7;
        int c;
        if (a>b){
            c = a+b;
        }
        else {
            c = (a+b)*5;
        }
        System.out.println(c);



    }
}
