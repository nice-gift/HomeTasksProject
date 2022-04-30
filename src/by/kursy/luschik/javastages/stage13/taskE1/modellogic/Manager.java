package by.kursy.luschik.javastages.stage13.taskE1.modellogic;

public class Manager {
    public static int getMax(double... numbers) {
        double max = Double.MIN_VALUE;
        int indexMax = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                indexMax = i;
            }
        }

        return indexMax;
    }

    public static int getMIn(double... numbers) {
        double min = Double.MAX_VALUE;
        int indexMin = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                indexMin = i;
            }
        }

        return indexMin;
    }

    public static double productNums(int indexMin, int indexMax,
                                     double... numbers) {
        double prodNum = 1;

        for (int i = indexMin + 1; i < indexMax; i++) {
            prodNum *= numbers[i];
        }

        if (Math.abs(indexMax - indexMin) == 1) {
            prodNum = 0;
        }

        return prodNum;
    }
}
