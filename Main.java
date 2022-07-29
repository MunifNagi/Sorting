import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numArr = { 99, 5, 3, 8, 9, 50, -3, 8, -20, 9, 21 };
        System.out.println("number Array before sorting");
        printArray(numArr);
        SelectionSort.sort(numArr);
        System.out.println("number Array sorted");
        printArray(numArr);

        System.out.println("");
        System.out.println("Try selecting the order and algorithm for the following arrays");
        String[] sortingAlgortithms = { "1) Merge Sort in ascending order", "2) Merge Sort in descending order",
                "3) Selection Sort in ascending order", "4)Selection sort in descending order" };
        int[] numArray = { 1, 23, 3, 4, 2, -14, 10, 8, -20, 9, 21 };

        runAlgorithm(numArray, sortingAlgortithms);
        System.out.println("");
        String[] stringArray = { "zc", "aba", "ab", "ba", "abc", "a", };
        runAlgorithm(stringArray, sortingAlgortithms);
        System.out.println("");
        char[] charArray = { 'a', 'z', 'M', 'N', 'Z', 'A' };
        runAlgorithm(charArray, sortingAlgortithms);
    }


    static void runAlgorithm(int[] arr, String[] sortingAlgortithms) {
        Scanner sc = new Scanner(System.in);
        printArray(arr);
        System.out.println("How would you like the number array above to be sorted?");
        for (String s : sortingAlgortithms) {
            System.out.println(s);
        }
        String userInput = sc.next();
        switch (userInput) {
            case "1":
                MergeSort.sort(arr, false);
                break;
            case "2":
                MergeSort.sort(arr, true);
                break;
            case "3":
                SelectionSort.sort(arr, false);
                break;
            case "4":
                SelectionSort.sort(arr, true);
                break;
            default:
                MergeSort.sort(arr);
        }
        printArray(arr);
    }

    static void runAlgorithm(char[] arr, String[] sortingAlgortithms) {
        Scanner sc = new Scanner(System.in);
        printArray(arr);
        System.out.println("How would you like the number array above to be sorted?");
        for (String s : sortingAlgortithms) {
            System.out.println(s);
        }
        String userInput = sc.next();
        switch (userInput) {
            case "1":
                MergeSort.sort(arr, false);
                break;
            case "2":
                MergeSort.sort(arr, true);
                break;
            case "3":
                SelectionSort.sort(arr, false);
                break;
            case "4":
                SelectionSort.sort(arr, true);
                break;
            default:
                MergeSort.sort(arr);
        }
        printArray(arr);
    }

    static void runAlgorithm(String[] arr, String[] sortingAlgortithms) {
        Scanner sc = new Scanner(System.in);
        printArray(arr);
        System.out.println("How would you like the number array above to be sorted?");
        for (String s : sortingAlgortithms) {
            System.out.println(s);
        }
        String userInput = sc.next();
        switch (userInput) {
            case "1":
                MergeSort.sort(arr, false);
                break;
            case "2":
                MergeSort.sort(arr, true);
                break;
            case "3":
                SelectionSort.sort(arr, false);
                break;
            case "4":
                SelectionSort.sort(arr, true);
                break;
            default:
                MergeSort.sort(arr);
        }
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    static void printArray(char[] arr) {
        for (char i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    static void printArray(String[] arr) {
        for (String i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

}
