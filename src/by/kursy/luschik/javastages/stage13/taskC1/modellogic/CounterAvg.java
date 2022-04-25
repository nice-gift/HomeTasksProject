package by.kursy.luschik.javastages.stage13.taskC1.modellogic;

public class CounterAvg {
    public static double getAvg(int... arrays) {
        double sum = 0;
        for (int t :
                arrays) {
            sum += t;
        }
        return sum / arrays.length;
    }
}
