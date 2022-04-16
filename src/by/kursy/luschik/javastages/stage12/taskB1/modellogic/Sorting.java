package by.kursy.luschik.javastages.stage12.taskB1.modellogic;

public class Sorting {
    public static Boolean isNumsSorted(double... arrays) {

        for (int i = 0; i < arrays.length-1; i++) {

            if (arrays[1] > arrays[0] && arrays[i + 1] < arrays[i]) {
                return false;
            }

            if (arrays[1] < arrays[0] && arrays[i + 1] > arrays[i]) {
                return false;
            }
        }

        return true;
    }
}
