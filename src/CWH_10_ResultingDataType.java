public class CWH_10_ResultingDataType
{
    public static void main(String[] args) {

        /*
        R = b + s ---> int
        R = s + i ---> int
        R = l + f ---> float
        R = i + f ---> float
        R = c + i ---> int
        R = c + s ---> int
        R = l + d ---> double
        R = f + d ---> double

        b = byte
        s = short
        i = integer
        l = long
        f = float
        d = double
        c = character
        */


        byte b = 5;
        short s = 7;
        int i = 11;
        long l = 1687756;
        float f = 1.07f;
        char c = 'M';
        double d = 5.06;
        System.out.println(b+s);
        System.out.println(s+i);
        System.out.println(l+f);
        System.out.println(i+f);
        System.out.println(c+i);
        System.out.println(c+s);
        System.out.println(l+d);
        System.out.println(f+d);



//        Increment and decrement operators

        int j = 56;
//        b = j++ ---> first b is assigned j and then j is incremented
//        b = ++j ---> first j is incremented then b is assigned j

        System.out.println(j++);    //
        System.out.println(j);

        int k = 75;
        System.out.println(++k);
        System.out.println(k);

        char ch = 'a';
        System.out.println(++ch);
    }
}
