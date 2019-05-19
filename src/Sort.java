import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String a[] = new String[7];

        a[0] = "O";
        a[1] = "A";
        a[2] = "F";
        a[3] = "G";
        a[4] = "C";
        a[5] = "U";
        a[6] = "Z";

        Arrays.sort(a);
        System.out.println("Sorted: " + Arrays.toString(a));

    }
}
