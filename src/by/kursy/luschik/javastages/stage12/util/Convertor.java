package by.kursy.luschik.javastages.stage12.util;


public class Convertor {
    public static String convert(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int element : array) {
            builder.append(element).append(" ");
        }
        return builder + "";
    }
}
