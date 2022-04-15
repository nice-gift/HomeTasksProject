package by.kursy.luschik.javastages.stage12.taskA3.modellogic;

public class Addition {
    public static double sumDigitsThatLessAvg(double avg, double... arrays) {
        double sum = 0;
        for (double element : arrays) {
            if (element < avg) {
                sum += element;
            }
        }
        return sum;
    }
}
