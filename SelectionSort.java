public class SelectionSort {
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

}
