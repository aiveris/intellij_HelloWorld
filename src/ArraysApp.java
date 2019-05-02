public class ArraysApp {

    public static void main(String[] args){

        int[] arrayInt = new int[5]; // decleration

        //initialize each value
        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 30;
        arrayInt[3] = 40;
        arrayInt[4] = 50;

        System.out.println("value at index 0: " + arrayInt[0]);
        System.out.println("value at index 4: " + arrayInt[4]);

        System.out.println("======================================");

        String[] arrayStr = new String[5]; // decleration

        //initialize each value
        arrayStr[0] = "first";
        arrayStr[1] = "second";
        arrayStr[2] = "third";
        arrayStr[3] = "fourth";
        arrayStr[4] = "fifth";

        System.out.println("value at index 0: " + arrayStr[0]);
        System.out.println("value at index 4: " + arrayStr[4]);

        System.out.println("======================================");

        //Declare & initialise
        int[] arrayInt1 = {10,20,30,40,50};
        String[] arrayStr1 = {"first", "second", "third", "fourth", "fifth" };

        System.out.println("arrayInt1[3] : " + arrayInt1[3]);
        System.out.println("arrayStr1[3] : " + arrayStr1[3]);

        System.out.println("======================================");

        //System.out.println("arrayInt1[3] : " + arrayInt1[5]);//error



    }
}
