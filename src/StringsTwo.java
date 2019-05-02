import com.sun.prism.shader.Solid_TextureRGB_AlphaTest_Loader;

public class StringsTwo {

    public static void main(String[] args) {

        int int_a = 100;
        int int_b = 200;
        System.out.println( int_a + int_b );

        String str_a = "100";
        String str_b = "200";
        System.out.println( str_a + str_b );

        System.out.println( "=====================\n" );

        String name = "Yohan";
        String surname = "Wadia";
        System.out.println(name + " " + surname);

        System.out.println(name.concat(surname));
        System.out.println(name.concat(" X ").concat(surname));
        System.out.println(name);

        System.out.println( "=======================\n" );

        String str="Hi";
        String str1=str.concat(", how are you?").concat(" I am fine.");
        System.out.println(str1);




    }
}
