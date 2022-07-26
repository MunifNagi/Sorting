/**
 * The SelectionSort class implements the selection
 * sorting algorithm.
 */
class SelectionSort {
    public static void sort(int[] array, boolean desc) {

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < array.length; j++) {// finds the minimum element in array[i..]
                if ((!desc && (array[j] < array[index])) || (desc && (array[j] > array[index]))) {
                    index = j;
                }
            }
            // place the minimum found in sorted part by swapping it with current array[i]
            int minimum = array[index];
            array[index] = array[i];
            array[i] = minimum;
        }

    }

    public static void sort(char[] array, boolean desc) {

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < array.length; j++) {// finds the minimum element in array[i..]
                if ((!desc && Character.compare(array[j], array[index]) < 0)
                        || (desc && Character.compare(array[j], array[index]) > 0)) {
                    index = j;
                }
            }
            // place the minimum found in sorted part by swapping it with current array[i]
            char minimum = array[index];
            array[index] = array[i];
            array[i] = minimum;

        }

    }

    public static void sort(String[] array, boolean desc) {

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < array.length; j++) {// finds the minimum element in array[i..]
                if ((!desc && array[j].compareTo(array[index]) < 0)
                        || (desc && array[j].compareTo(array[index]) > 0)) {
                    index = j;
                }
            }
            // place the minimum found in sorted part by swapping it with current array[i]
            String smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;

        }

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] numArray = { 1, 23, 3, 4, 2, 14, 10, 8, 20, 9, 21 };
        char[] charArray = { 'a', 'z', 'K', 'A', 'X', 'M', };
        String[] stringArray = { "zc", "aba", "ab", "ba", "abc", "a", };

        System.out.println("Arrays before sorting");
        printArray(numArray);
        printArray(charArray);
        printArray(stringArray);

        // sorting array in Ascending order
        sort(numArray, false);
        sort(charArray, false);
        sort(stringArray, false);

        System.out.println("Arrays sorted in ascending order");
        printArray(numArray);
        printArray(charArray);
        printArray(stringArray);

        // sorting array in Descending order
        sort(numArray, true);
        sort(charArray, true);
        sort(stringArray, true);

        System.out.println("Arrays sorted in descending order");
        printArray(numArray);
        printArray(charArray);
        printArray(stringArray);
    }

}
