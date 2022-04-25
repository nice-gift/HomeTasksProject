package by.kursy.luschik.javastages.stage13.taskA1.modellogic;

public class Counter {
    public static int countNotNull(int... arrays) {
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != 0) {
                count++;
            }
        }
        return count;
    }
}
