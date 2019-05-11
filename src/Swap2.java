public class Swap2 {
    public static void main(String args[]) {
        // create a function that sums (adds)
        // all elements inside an array

        // int[] arr = {10,1,2,3,-1};
        int[] arr = {1, 2, 3};
        System.out.println("Sum: " + sumOfArray(arr));
    }

    public static int sumOfArray(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]; // equivalent to this expression: sum = sum + arr[i];
        }
        return sum;
    }
}