package by.kursy.luschik.javastages.stage12.taskB3.modellogic;

public class CompareNums {
    public static boolean isAllNumsTheSame(double... arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] != arrays[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllNumsADifferent(double... arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = i+1; j < arrays.length; j++) {
                if (arrays[j] == arrays[i]) {
//            for (int j = arrays.length-1; j >i; j--) {
//                if (arrays[i] == arrays[j]) {
//                }
//            }
                    return false;
                }
            }
        }
        return true;
    }
}
