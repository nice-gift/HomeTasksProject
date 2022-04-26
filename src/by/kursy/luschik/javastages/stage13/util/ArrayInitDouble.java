package by.kursy.luschik.javastages.stage13.util;

import by.kursy.luschik.javastages.view.Printer;

import java.util.Random;
import java.util.Scanner;

public class ArrayInitDouble {
    public static void consoleInit(int size, double... arrays) {
        Scanner scanner = new Scanner(System.in);
        String msg = String.format("Input %d integers: ", size);
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
            arrays[i] = min + (max - min) * random.nextDouble();
        }
    }
}
