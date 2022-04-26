package by.kursy.luschik.javastages.stage13.taskF1.modellogic;

public class ArraySorter {
    public static void insertedSortDsc(int indexFirst0, double[] array) {
        for (int i = 1; i < indexFirst0; i++) {
            double element = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < element) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
    }
}
