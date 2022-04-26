package by.kursy.luschik.javastages.stage13.util;

import by.kursy.luschik.javastages.view.Printer;

import java.util.Random;
import java.util.Scanner;

public class ArrayInitDouble {
    public static void consoleInit(double... arrays) {
        Scanner scanner = new Scanner(System.in);
        String msg = String.format("Input %d numbers: ", arrays.length);
        Printer.print(msg);
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextDouble();
        }
    }

    public static void rndInitDouble(double... arrays) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Printer.print("Enter min value of random: ");
        double min = scanner.nextDouble();
        Printer.print("Enter max value of random: ");
        double max = scanner.nextDouble();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (max - min + 1) * random.nextDouble() + min;
        }
    }
}
