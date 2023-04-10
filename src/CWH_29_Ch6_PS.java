import java.util.Arrays;

public class CWH_29_Ch6_PS {
    public static void main(String[] args) {


        //Question 1
/*         float [] floats = {5.6f, 8.95f, 5.65f, 87.2f, 45.63f};
        float sum = 0;
        for(int i = 0; i < floats.length; i++){
            sum += floats[i];
        }
        System.out.println(sum);
*/

            //Question 2
     /*
        int given_int = 49;
        int [] array = {56,58,47,49,45};
        boolean isInArray = false;
        for (int element:array){
            if (given_int == element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The Value is present in Array.");
        }
        else{
            System.out.println("The Value is not present in Array.");
        }
*/


        // Question 3
/*        float [] physicsMarks = {56, 89, 59, 87, 45};
        float sum = 0;
        for(float marks:physicsMarks){
            sum = sum+marks;
        }
        float average = (sum/physicsMarks.length);
        System.out.printf("%f is the average of all Physics marks obtained by students", average);
*/

        // Question 6

      /*  int [] array = {5, 4, 8, 2, 1, 3};
        int i = 0;
        for(int numbers:array){
            if(numbers>i){
                i=numbers;
            }
        }
        System.out.printf("%d is the greatest element in given array.", i);
        System.out.println("");

*/

        // Question 6

  /*      int [] array2 = {5, 4, 8, 2, 1, 3};
        int j = 0;
        for(int element:array2){
            if(element<j){
                j=element;
            }
        }
        System.out.printf("%d is the smallest element in given array.", j);
    */


        //Question 4
        int [][] mat1 = {{1,2,3},
                {4,5,6}};
        int [][] mat2 = {{2,6,13},
                {3,6,1}};
        int [][] result = {{0,0,0},
                {0,0,0}};
        for (int i=0; i<mat1.length;i++){   //row number of times
            for (int j =0; j<mat1[i].length;j++){   //column number of times
                System.out.printf("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] =mat1[i][j] + mat2[i][j];

            }
            System.out.println("");
        }

        // Printing the elements of a 2-D Array
        for (int i=0; i<mat1.length;i++){   //row number of times
            for (int j =0; j<mat1[i].length;j++){   //column number of times
                System.out.print(result[i][j]+ " ");
                result[i][j] =mat1[i][j] + mat2[i][j];

            }
            System.out.println("");
        }






    }
}
