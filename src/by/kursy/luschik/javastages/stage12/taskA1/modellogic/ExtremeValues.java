package by.kursy.luschik.javastages.stage12.taskA1.modellogic;

public class ExtremeValues {
    public static double findMin(double... arrays) {
        double min = Integer.MAX_VALUE;
        for (double element : arrays
        ) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public static double findMax(double... arrays) {
        double max = Integer.MIN_VALUE;
        for (double element : arrays
        ) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static double findAverage(double... arrays) {
        int count = 0;
        double sum = 0;
        for (double element : arrays
        ) {
            sum += element;
            count++;
        }
        return sum / count;
    }
}
