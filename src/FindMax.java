public class FindMax {
    public static void main(String args[]) {
        int[] arr = {-1, 89, -2, 3, 0, -999};
        System.out.println("Max: " + findmax(arr));
    }

    public static int findmax(int[] arr){
        // can't assign 0 in this case,
        // since it would not work when
        // the array would consist of only
        // possitive numbers
        int current_max = arr[0];

        // skip the arr[0] since current_min is already arr[0]
        for(int i = 1; i < arr.length; i++){
            if(current_max < arr[i]){
                current_max = arr[i];
            }
        }
        return current_max;
    }
}
