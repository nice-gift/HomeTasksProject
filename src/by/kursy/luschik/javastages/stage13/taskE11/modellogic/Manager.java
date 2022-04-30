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
}
