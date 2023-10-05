public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int[] sortedArray = bubbleSort(arr);
        for (int i : sortedArray) {
            System.out.print(i + " ");
        }
    }

}