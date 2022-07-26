
public class Main {
    public static void main(String[] args) {
        Boolean descedningOrder = true;
        int[] numArray = { 1, 23, 3, 4, 2, -14, 10, 8, -20, 9, 21 };
        printArray(numArray);
        MergeSort.sort(numArray, descedningOrder);
        printArray(numArray);

        descedningOrder = false;
        String[] stringArray = { "zc", "aba", "ab", "ba", "abc", "a", };
        printArray(stringArray);
        SelectionSort.sort(stringArray, descedningOrder);
        printArray(stringArray);
        // // sorting array in Ascending order
        // SS.sort(numArray, false);
        // SS.sort(charArray, false);
        // SS.sort(stringArray, false);

        // // sorting array in Descending order
        // SS.sort(numArray, true);
        // SS.sort(charArray, true);
        // SS.sort(stringArray, true);

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

}