package by.kursy.luschik.javastages.stage13.taskE1.modellogic;

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

    public static int getMIn(double... numbers) {
        int indexMin = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[indexMin] > numbers[i]) {
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
