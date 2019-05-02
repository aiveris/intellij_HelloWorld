public class SimpleLoopDemo {
    public static void main(String[] args) {
        System.out.println(power(2, 4));}

    public static int power (int input, int iter){
        for (int i=0; i<iter - 1; i++){
            input = input * input;}
    return input;}

}
