public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        // Loop through the array starting from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Take the value of the current card
            int j = i - 1; // Start comparing with the cards to the left

            // While the card to the left is greater than the current card
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Move the left card one position to the right
                j = j - 1; // Move to the next card to the left
            }

            arr[j + 1] = key; // Put the current card in the right place
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int[] sortedArray = insertionSort(arr);
        for (int i : sortedArray) {
            System.out.print(i + " ");
        }
    }
}
