package by.kursy.luschik.javastages.stage13.taskС1.modellogic;

public class Counter {
    public static int countNumsBiggerAvg(double avg, int... arrays) {
        int count = 0;
        for (int t : arrays) {
            if (t > avg) {
                count++;
            }

        }
        return count;
    }
}
