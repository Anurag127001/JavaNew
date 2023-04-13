public class CWH_32_MethodOverloading {
    static void change(int a){
        a = 98;
    }

    static void changeArry(int [] arr){
        arr[0] =98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n " +
                "Plagiarism!");

    }



    static void foo(){
        System.out.println("I Love you!");
    }
    static void foo(int a, String b){
        System.out.println("I Love you " + a +"! " + b);
    }

    public static void main(String[] args) {
        tellJoke();

        //Changing the array
    int [] marks = {52, 73, 77, 89, 98, 94};
    changeArry(marks);
        System.out.println("The value of first element after changing arrya is " + marks[0]);

    // Changing the integer
    int x = 45;
    change(x);
        System.out.println("The value of x after changing x is " + x);



     //Method overloading
     foo();
     foo(3000, "RDJ ");






    }
}
