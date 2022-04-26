package by.kursy.luschik.javastages.stage13.taskF1.modellogic;

public class Bound {
    public static int getIndexFirst0(double... numbers) {
        int indexFirst0 = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                indexFirst0 = i;
                break;
            }
        }
        return indexFirst0;
    }

    public static int getIndexLast0(double... numbers) {
        int indexLast0 = 0;
        for (int i = numbers.length-1; i >= 0; i--) {
            if (numbers[i] == 0) {
                indexLast0 = i;
                break;
            }
        }
        return indexLast0;
    }

}
