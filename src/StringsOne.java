public class StringsOne {

    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcd";
        String c = new String("abcd");
        //String d = a;

        System.out.println(a==b);
        System.out.println(a.equals(b));

        System.out.println("==================");

        System.out.println(a==c);
        System.out.println(a.equals(c));

        System.out.println("==================");

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        //System.out.println(System.identityHashCode(d));

    }
}
