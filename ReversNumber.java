public class ReversNumber {
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            // Swap the elements at the i-th and (n-i-1)-th indices
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        // Print the reversed array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
