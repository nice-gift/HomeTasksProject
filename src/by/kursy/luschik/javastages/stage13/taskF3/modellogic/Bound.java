package by.kursy.luschik.javastages.stage13.taskF3.modellogic;

public class Bound {
    public static int indexFirstNegative(double... numbers) {
        int indexFirstNegat = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                indexFirstNegat = i;
                break;
            }
        }
        return indexFirstNegat;
    }

    public static int indexLastNegative(double... numbers) {
        int indexLastNegat = numbers.length;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] < 0) {
                indexLastNegat = i;
                break;
            }
        }
        return indexLastNegat;
    }
}
