public class MergeSort {
    public static void mergeSort(int[] array) {
        int arrayLength = array.length;
        if (arrayLength < 2) {
            return;
        }
        int midPoint = arrayLength / 2;
        int[] left = new int[midPoint]; // breaking the input array into two halves
        int[] right = new int[arrayLength - midPoint]; // just in case we have odd arrayLength

        for (int i = 0; i < midPoint; i++) {// filling up the left half of the array
            left[i] = array[i];
        }

        for (int i = midPoint; i < arrayLength; i++) {// filling up the right half of the array
            right[i - midPoint] = array[i];
        }
        // recursivly MergeSorting the two halves we just creating until we reach a
        // length of 1 to merge them after
        mergeSort(left);
        mergeSort(right);

        // finally merge the two sorted arrays into one array
        merge(array, left, right);
    }

    private static void merge(int[] mergedArray, int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length;

        // initialized three indexes for both halves and the merged array
        int i = 0, j = 0, k = 0;
        // looping in both sorted halves of the array and adding the next one into our
        // merged arra
        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) { // if next elemnt is from the left sorted array
                mergedArray[k] = left[i];
                i++;
            } else {// else the next element is from the right sorted array
                mergedArray[k] = right[j];
                j++;
            }
            k++;
        }

        // we might still have remaining sorted elements in either halves of the array
        while (j < rightLength) {
            mergedArray[k] = right[j];
            j++;
            k++;
        }
        while (i < leftLength) {
            mergedArray[k] = left[i];
            i++;
            k++;
        }

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
