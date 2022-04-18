package by.kursy.luschik.javastages.stage12.taskB5.modellogic;

public class ExamResult {
    public static String findPercentage(int mark, int... arrays) {
        double count = 0;
        for (int element : arrays
        ) {
            if (element == mark) {
                count++;
            }
        }
        return String.format("%.2f", count / arrays.length * 100) + "% " +
                String.format("(%.0f)", count);
    }
}
