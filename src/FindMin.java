public class FindMin {
    public static void main(String args[]) {
        int[] arr = {-1, 89, -2, 3, 0, -999};
        System.out.println("Min: " + findMin(arr));
    }

    public static int findMin(int[] arr){
        // can't assign 0 in this case,
        // since it would not work when
        // the array would consist of only
        // possitive numbers
        int current_min = arr[0];

        // skip the arr[0] since current_min is already arr[0]
        for(int i = 1; i < arr.length; i++){
            if(current_min > arr[i]){
                current_min = arr[i];
            }
        }

        return current_min;
    }
}
