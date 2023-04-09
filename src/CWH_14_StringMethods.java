import java.util.Locale;

public class CWH_14_StringMethods {
    public static void main(String[] args) {
        String name = "Harry";

        System.out.println(name);

        int len = name.length();
        System.out.println(len);

        String low  = name.toLowerCase();
        System.out.println(low);

        String upp = name.toUpperCase();
        System.out.println(upp);

        String nonTrimmedString = "           Anurag         ";
        String trimStr = nonTrimmedString.trim();
        System.out.println(nonTrimmedString);
        System.out.println(trimStr);

        System.out.println(name.substring(1,4));

        System.out.println(name.replace('r','p'));

        System.out.println(name.replace("rry","ppier"));

        System.out.println(name.startsWith("Ha"));

        System.out.println(name.endsWith("Ha"));

        System.out.println(name.charAt(2));

        System.out.println(name.endsWith("Ha"));

        System.out.println(name.indexOf("ry"));

        System.out.println(name.equals("Harry"));

        System.out.println(name.equalsIgnoreCase("harry"));

        String modifiedName = "Mississipi";
        System.out.println(modifiedName.indexOf("ssi"));
        System.out.println(modifiedName.indexOf("ssi", 3));
        System.out.println(modifiedName.lastIndexOf("si"));



//        Escape Sequence Characters
        /*

        \t  = insert tab in text at this point
        \b  = insert backspace in text at this point
        \n  = insert newline in text at this point
        \r  = insert carriage return in text at this point
        \f  = insert formfeed in text at this point
        \'  = insert single quote character in text at this point
        \"  = insert double quote character in text at this point
        \\  = insert backslash in text at this point

        */




    }
}
