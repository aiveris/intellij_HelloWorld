public class BubbleSort2 {
    public static void main(String args[]) {
        // declare and allocate
        int[][] arr = {{1, 5}, {10, 2}, {58, 55}};

        // before sorting
        for(int i = 0; i < arr.length; i++)
            System.out.print("{" + arr[i][0] + "," + arr[i][1] + "} ");
        System.out.println();

        // sort
        bubbleSort2D(arr);

        // // after sorting
        for(int i = 0; i < arr.length; i++)
            System.out.print("{" + arr[i][0] + "," + arr[i][1] + "} ");
        System.out.println();
    }

    public static void bubbleSort2D(int arr[][]){
        // How to access the 2nd element in a nested array
        // for(int i = 0; i < arr.length; i++){
        //     // int[][] arr = {{1, 5}, {10, 2}, {58, 55}};
        //     System.out.print(arr[i][1] + " ");
        // }
        // System.out.println();
        
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){ // 1 optimization used
                if (arr[j][1] > arr[j+1][1]){
                    int[] temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
