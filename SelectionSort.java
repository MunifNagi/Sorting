public class SelectionSort {
    static void sort(int[] array, boolean isDesc) {
        // finds the minimum element in array[i..] and swap it with array[i]

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if ((!isDesc && (array[j] < array[index])) || (isDesc && (array[j] > array[index]))) {
                    index = j;
                }
            }
            swap(array, i, index);
        }
    }

    static void swap(int[] array, int index1, int index2) {
        int tmp = array[index2];
        array[index2] = array[index1];
        array[index1] = tmp;
    }

    static void sort(int[] array) {
        sort(array, false);
    }


    static void sort(char[] array, boolean isDesc) {
        // finds the minimum element in array[i..] and swap it with array[i]
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if ((!isDesc && Character.compare(array[j], array[index]) < 0)
                        || (isDesc && Character.compare(array[j], array[index]) > 0)) {
                    index = j;
                }
            }
            swap(array, i, index);
        }
    }

    static void swap(char[] array, int index1, int index2) {
        char tmp = array[index2];
        array[index2] = array[index1];
        array[index1] = tmp;
    }

    static void sort(char[] array) {
        sort(array, false);
    }

    static void sort(String[] array, boolean isDesc) {
        // finds the minimum element in array[i..] and swap it with array[i]
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if ((!isDesc && array[j].compareTo(array[index]) < 0)
                        || (isDesc && array[j].compareTo(array[index]) > 0)) {
                    index = j;
                }
            }
            swap(array, i, index);
        }
    }

    static void swap(String[] array, int index1, int index2) {
        String tmp = array[index2];
        array[index2] = array[index1];
        array[index1] = tmp;
    }

    static void sort(String[] array) {
        sort(array, false);
    }

}
