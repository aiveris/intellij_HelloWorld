public class StringsFour {

    public static void main(String[] args) {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str);

        System.out.println("==========================");

        str = str.toLowerCase();// now it has been saved in str
        System.out.println(str);

        int len = str.length();
        System.out.println("The length of the txt string is: " + len);

        System.out.println("==========================");

        String email  = "johnny_boy@gmail.com";
        String email2 = "  johnny_boy@gmail.com   "; //email with extra spaces

        if (email.equals(email2)) {
            System.out.println("This line will never execute");
        } else {
            System.out.println("Emails address is WRONG!");
        }

        String email3 = email2.trim();

        if (email.equals(email3)) {
            System.out.println("TRIM() removed extra SPACES... Email address CORRECT!!!");}
        else {System.out.println("Emails address is WRONG!");}

        System.out.println("==========================");

        String str1 = "johnny_boy@gmail.com";
        String str2 = "Johnny_boy@gmail.Com"; //email with capital letters(UpperCase)

        if (str1.equals(str2)) {System.out.println("This line will never execute");}
        else {System.out.println("Emails address is wrong");}

        int x = str1.compareToIgnoreCase(str2);
        System.out.println("Value of x: " + x);


        if (x == 1) {System.out.println("str1 is greater");}
        else if (x == -1) {System.out.println("str1 is smaller");}
        else if (x == 0) {System.out.println("They both are EQUAL");}

    }
}
