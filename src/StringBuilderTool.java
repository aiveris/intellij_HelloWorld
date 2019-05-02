public class StringBuilderTool {

    public static void main(String[] args) {

        String x = "Hello ";
        x = x + "Java";
        x = x + ", this is ";
        x = x + "my World.";
        System.out.println(x);




        StringBuilder sb = new StringBuilder();
        sb.append("Hello ").append("Java").append(", this is ").append("my World.");
        System.out.println(sb);


    }

}
