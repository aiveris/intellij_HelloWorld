public class BubbleSort {
    public static void main(String args[]) {
        // declare and allocate
        int[] arr = new int[20];

        // fill array
        fillArray(arr);

        // before sorting
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        // sort
        bubbleSort(arr);

        // after sorting
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void fillArray(int[] arr){
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 50 + 1);
    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){ // 1 optimization used
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}