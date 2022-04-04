package by.kursy.luschik.javastages.stage11.taskB5.modellogic;

import javafx.util.Builder;

public class Manager {
    public static String getPrimeDivider(int number) {
        String msg = "";

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                int count = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    msg += i + " ";
                }
            }
        }
        return msg;
    }
}