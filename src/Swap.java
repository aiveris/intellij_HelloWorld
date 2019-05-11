import java.lang.reflect.Array;

public class Swap {
    public static void main(String[] args) {
        // 0. - Creating a sequence of steps to swap a variable
        // Integer first, second;
        // first = 1; second = 2;
        // System.out.println("Before swaping first was: "+first+" second was: "+second);

        // incorrect naive solution
        // second = first;
        // first = second; // the same as first = first

        // int temp = second;
        // second = first;
        // first = temp;
        // System.out.println("After swapping first is: "+first+" second is: "+second);


        //create a function that sums all elements inside an array

        int[] arrayOfInts = {1,2,3,4,5,6,7};
        int sum;
        for(int i=0; i<arrayOfInts.length; i++){
            sum = arrayOfInts[i];
            sum = sum + i;
            System.out.print(sum);

        }


    }
}
