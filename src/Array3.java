public class Array3 {

    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 3, 0, 7};

        findAllEven(arr);
        findFirstEven(arr);
    }

    private static void findAllEven(int[] arr) {
        System.out.print("All even: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    private static void findFirstEven(int[] arr) {
        System.out.print("First even: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                // almost the same algorithm as findAll except we break immediatelly if we find anything
                break;
            }
        }
        System.out.println();
    }

}