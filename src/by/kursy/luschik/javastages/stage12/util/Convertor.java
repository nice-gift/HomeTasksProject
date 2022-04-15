package by.kursy.luschik.javastages.stage12.util;


public class Convertor {
    public static String convert(double[] array) {
        StringBuilder builder = new StringBuilder();
        for (double element : array) {
            String result=String.format("%.2f",element);
            builder.append(result).append(" ");
        }
        return builder + "";
    }
}
