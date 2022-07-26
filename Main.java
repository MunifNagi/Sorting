import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numArray = { 1, 23, 3, 4, 2, -14, 10, 8, -20, 9, 21 };
        runAlgorithm(numArray);

        String[] stringArray = { "zc", "aba", "ab", "ba", "abc", "a", };
        runAlgorithm(stringArray);

        char[] charArray = { 'a', 'z', 'M', 'N', 'Z', 'A' };
        runAlgorithm(charArray);
    }

    static void runAlgorithm(int[] arr) {
        Boolean descedningOrder;
        Scanner sc = new Scanner(System.in);
        printArray(arr);
        System.out.println("How would you like the number array to be sorted?");
        System.out.println("*. Enter 1 for ascedning order");
        System.out.println("*. Press 2 for descending order");
        String userInput = sc.next();
        if (userInput.equals("1")) {
            descedningOrder = false;
        } else {
            descedningOrder = true;
        }
        System.out.println("Which sorting algorithm would you like to use?");
        System.out.println("*. Enter 1 for Merge Sort");
        System.out.println("*. Press 2 for Selection Sort");
        userInput = sc.next();
        if (userInput.equals("1")) {
            MergeSort.sort(arr, descedningOrder);
        } else {
            SelectionSort.sort(arr, descedningOrder);
        }
        printArray(arr);

    }

    static void runAlgorithm(char[] arr) {
        Boolean descedningOrder;
        printArray(arr);
        Scanner sc = new Scanner(System.in);

        System.out.println("How would you like the char array to be sorted?");
        System.out.println("*. Enter 1 for ascedning order");
        System.out.println("*. Press 2 for descending order");
        String userInput = sc.next();
        if (userInput.equals("1")) {
            descedningOrder = false;
        } else {
            descedningOrder = true;
        }
        System.out.println("Which sorting algorithm would you like to use?");
        System.out.println("*. Enter 1 for Merge Sort");
        System.out.println("*. Press 2 for Selections Sort");
        userInput = sc.next();
        if (userInput.equals("1")) {
            MergeSort.sort(arr, descedningOrder);
        } else {
            SelectionSort.sort(arr, descedningOrder);
        }
        printArray(arr);
    }

    static void runAlgorithm(String[] arr) {
        Boolean descedningOrder;
        Scanner sc = new Scanner(System.in);
        printArray(arr);
        System.out.println("How would you like the string array to be sorted?");
        System.out.println("*. Enter 1 for ascedning order");
        System.out.println("*. Press 2 for descending order");
        String userInput = sc.next();
        if (userInput.equals("1")) {
            descedningOrder = false;
        } else {
            descedningOrder = true;
        }
        System.out.println("Which sorting algorithm would you like to use?");
        System.out.println("*. Enter 1 for Merge Sort");
        System.out.println("*. Press 2 for Selection Sort");
        userInput = sc.next();
        if (userInput.equals("1")) {
            MergeSort.sort(arr, descedningOrder);
        } else {
            SelectionSort.sort(arr, descedningOrder);
        }
        printArray(arr);
    }

    static void printArray(int[] arr) {
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static void printArray(char[] arr) {
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static void printArray(String[] arr) {
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
