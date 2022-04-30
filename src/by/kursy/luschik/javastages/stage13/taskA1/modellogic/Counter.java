package by.kursy.luschik.javastages.stage13.taskA1.modellogic;

public class Counter {
    public static int countNotNull(int... arrays) {
        int count = 0;

        for (int t : arrays) {
            if (t != 0) {
                count++;
            }
        }

        return count;
    }
}
