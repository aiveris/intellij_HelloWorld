public class Fibonacci {
    public static void main(String[] args) {

        int prev=0, num=1, printVal=0;

        for(int i=0; i<=10; i++){

            printVal=prev+num;
            System.out.println(printVal);

            prev=num;
            num=printVal;




        }//for
    }//psv
}//class
