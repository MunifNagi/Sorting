public class MergeSort {
    static void sort(int[] array, boolean isisDesc) {
        int arrayLength = array.length;
        if (arrayLength < 2) {
            return;
        }
        // breaking the array into two halves
        int midPoint = arrayLength / 2;
        int[] left = new int[midPoint];
        int[] right = new int[arrayLength - midPoint];
        for (int i = 0; i < midPoint; i++) {
            left[i] = array[i];
        }
        for (int i = midPoint; i < arrayLength; i++) {
            right[i - midPoint] = array[i];
        }
        // recursivly MergeSorting the two halves we just creating until we reach a
        // length of 1, then merge sort them after
        sort(left, isisDesc);
        sort(right, isisDesc);
        merge(array, left, right, isisDesc);
    }

    private static void merge(int[] mergedArray, int[] left, int[] right, boolean isisDesc) {
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0, j = 0, k = 0;
        // looping in both sorted halves of the array and adding the next one into our
        // merged arrayy
        while (i < leftLength && j < rightLength) {
            if ((!isisDesc && (left[i] <= right[j])) || (isisDesc && (left[i] >= right[j]))) {
                mergedArray[k] = left[i];
                i++;
            } else {
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

    static void sort(char[] array, boolean isDesc) {
        int arrayLength = array.length;
        if (arrayLength < 2) {
            return;
        }
        int midPoint = arrayLength / 2;
        char[] left = new char[midPoint];
        char[] right = new char[arrayLength - midPoint];
        for (int i = 0; i < midPoint; i++) {
            left[i] = array[i];
        }
        for (int i = midPoint; i < arrayLength; i++) {
            right[i - midPoint] = array[i];
        }
        // recursivly MergeSorting the two halves we just creating until we reach a
        // length of 1, then merge sort them after
        sort(left, isDesc);
        sort(right, isDesc);
        merge(array, left, right, isDesc);
    }

    private static void merge(char[] mergedArray, char[] left, char[] right, boolean isDesc) {
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0, j = 0, k = 0;
        // looping in both sorted halves of the array and adding the next one into our
        // merged array
        while (i < leftLength && j < rightLength) {
            if ((!isDesc && Character.compare(left[i], right[j]) <= 0)
                    || (isDesc && (Character.compare(right[j], left[i]) <= 0))) {
                mergedArray[k] = left[i];
                i++;
            } else {
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

    static void sort(String[] array, boolean isDesc) {
        int arrayLength = array.length;
        if (arrayLength < 2) {
            return;
        }
        int midPoint = arrayLength / 2;
        String[] left = new String[midPoint];
        String[] right = new String[arrayLength - midPoint];
        for (int i = 0; i < midPoint; i++) {
            left[i] = array[i];
        }
        for (int i = midPoint; i < arrayLength; i++) {
            right[i - midPoint] = array[i];
        }
        // recursivly MergeSorting the two halves we just creating until we reach a
        // length of 1, then merge sort them after
        sort(left, isDesc);
        sort(right, isDesc);
        merge(array, left, right, isDesc);
    }

    private static void merge(String[] mergedArray, String[] left, String[] right, boolean isDesc) {
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0, j = 0, k = 0;
        // looping in both sorted halves of the array and adding the next one into our
        // merged array
        while (i < leftLength && j < rightLength) {
            if ((!isDesc && (left[i].compareTo(right[j]) <= 0))
                    || (isDesc && (right[j].compareTo(left[i]) <= 0))) {
                mergedArray[k] = left[i];
                i++;
            } else {
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

}
