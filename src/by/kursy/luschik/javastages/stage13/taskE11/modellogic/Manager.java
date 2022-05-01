package by.kursy.luschik.javastages.stage13.taskE11.modellogic;

public class Manager {
    public static int getMax(double... numbers) {
        int indexMax = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[indexMax] < numbers[i]) {
                indexMax = i;
            }
        }

        return indexMax;

    }

    public static double getSum(int indexMax, double... numbers) {
        double sum = 0;

        for (int i = indexMax + 1; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }
}
