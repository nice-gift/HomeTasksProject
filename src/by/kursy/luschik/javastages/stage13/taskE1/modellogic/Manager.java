package by.kursy.luschik.javastages.stage13.taskE1.modellogic;

public class Manager {
    public static double getMax(double... numbers) {
        double max = Double.MIN_VALUE;
        for (double t : numbers)
            if (t > max) {
                max = t;
            }
        return max;
    }

    public static double getMIn(double... numbers) {
        double min = Double.MAX_VALUE;
        for (double t : numbers)
            if (t < min) {
                min = t;
            }
        return min;
    }

    public static double productNums(double min, double max,
                                     double... numbers) {
        double prodNum = 1;
        for (double t : numbers) {
            if (t > min && t < max) {
                prodNum *= t;
            }
        }
        if (numbers.length < 3) {
            prodNum = 0;
        }
        return prodNum;
    }
}
