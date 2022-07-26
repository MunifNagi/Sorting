/**
 * The SelectionSort class implements the selection
 * sorting algorithm.
 */
class SelectionSort {
    public static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < array.length; j++) {// finds the minimum element in array[i..]
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            // place the minimum found in sorted part by swapping it with current array[i]
            int minimum = array[index];
            array[index] = array[i];
            array[i] = minimum;
        }

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] array = { 1, 23, 3, 4, 2, 14, 10, 8, 20, 9, 21 };

        System.out.println("Array before sorting");
        printArray(array);
        sort(array); // sort the array
        System.out.println("Array after sorting");
        printArray(array);
    }

}
