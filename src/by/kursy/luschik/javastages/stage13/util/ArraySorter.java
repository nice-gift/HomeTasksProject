package by.kursy.luschik.javastages.stage13.util;

public class ArraySorter {
    public static void insertedSortDsc(int indexBound, double[] array) {
        for (int i = 1; i < indexBound; i++) {
            double element = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < element) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
    }

    public static void selectedSortDsc(int indexBound, double[] array) {
        for (int i = 0; i < indexBound - 1; i++) {
            int indexMax = i;
            boolean flag = true;
            for (int k = 0; k < array[indexBound - 1]; k++) {
                if (array[k] > array[k + 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                break;
            }
            for (int j = i + 1; j < indexBound; j++) {
                if (array[indexMax] < array[j]) {
                    indexMax = j;
                }
            }
            double t = array[i];
            array[i] = array[indexMax];
            array[indexMax] = t;
        }
    }
}
