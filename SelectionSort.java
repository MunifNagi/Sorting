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
            int minimum = array[index];
            array[index] = array[i];
            array[i] = minimum;
        }

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
            char minimum = array[index];
            array[index] = array[i];
            array[i] = minimum;
        }

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
            String smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }

    }

}
