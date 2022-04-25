package by.kursy.luschik.javastages.stage13.taskB1.modellogic;

public class Counter {
    public static int countNumsGreater(int bound, int... arrays) {
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > bound) {
                count++;
            }
        }
        return count;
    }
}
