public class CWH_15_Ch3_PS {
    public static void main(String[] args) {
//        Question 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

//        Question 2
        String text = "To My Friend ";
        text = text.replace(" ", "_");
        System.out.println(text);

//        Question 3

        String letter = "Dear <|name|>, Thanks a lot ";
        letter = letter.replace("<|name|>", "Anurag");
        System.out.println(letter);

//        Question 4
        String newString = "This string  contains  double  spaces   and   triple   spaces  .";
        System.out.println(newString.contains("  "));
        System.out.println(newString.contains("   "));
        System.out.println(newString.indexOf("  "));
        System.out.println(newString.indexOf("   "));

//        Question 5
        String newLetter = "Dear Harry, This Java Course is nice. Thanks ";
        String formattedLetter = "Dear Harry,\nThis Java Course is nice.\n\tThanks ";
        System.out.println(formattedLetter);
    }
}
