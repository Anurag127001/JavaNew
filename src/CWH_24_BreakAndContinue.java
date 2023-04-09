public class CWH_24_BreakAndContinue {
    public static void main(String[] args) {
//        Break and continue using loops!
        for (int i = 0; i<5; i++){
            System.out.print(i+".");
            System.out.println("Java is Great!");
            if(i==2){
                System.out.println("Ending the Loop");
                break;
            }
        }
    }
}
