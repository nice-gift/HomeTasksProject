package by.kursy.luschik.javastages.stage13.taskF8.modellogic;

public class Bound {
    public static int getIndexFirstOdd(int... numbers) {
        int index = numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static int getIndexLastOdd(int... numbers) {
        int index = numbers.length;

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 1) {
                index = i;
                break;
            }
        }

        return index;
    }
}
