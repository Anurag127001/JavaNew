public class CWH_28_MultidimensionalArrays
{
    public static void main(String[] args)
    {
        //2D Array
        int [] [] flats ;
        flats = new int[2][3];
        flats [0] [0] = 100;
        flats [0] [1] = 101;
        flats [0] [2] = 102;

        flats [1] [0] = 200;
        flats [1] [1] = 201;
        flats [1] [2] = 202;

        System.out.println("Printing a 2-D array using for loop");
        for(int i = 0 ; i<flats.length;i++)
        {
            for (int j = 0; j<flats[i].length;j++)
            {
                System.out.println(flats[i][j]);
                System.out.print(" ");

            }
            System.out.println(" ");
        }
    }
}
