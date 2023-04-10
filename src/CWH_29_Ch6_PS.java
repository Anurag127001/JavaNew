import java.util.Arrays;

public class CWH_29_Ch6_PS {
    public static void main(String[] args) {


        //Question 1

        float [] floats = {5.6f, 8.95f, 5.65f, 87.2f, 45.63f};
        float sum = 0;
        for(int i = 0; i < floats.length; i++){
            sum += floats[i];
        }
        System.out.println(sum);

        int given_int = 45;
        int [] array = {56,58,47,49,45};
        Arrays.stream(array).findFirst()

    }
}
