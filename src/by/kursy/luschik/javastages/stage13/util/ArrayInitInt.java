package by.kursy.luschik.javastages.stage13.util;

import by.kursy.luschik.javastages.view.Printer;

import java.util.Random;
import java.util.Scanner;

public class ArrayInitInt {
    public static void consoleInit(int... arrays) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input any integers: ");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextInt();
        }
    }

    public static void rndInit(int... arrays) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Printer.print("Enter min value: ");
        int min = scanner.nextInt();
        Printer.print("Enter max value: ");
        int max = scanner.nextInt();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(max - min + 1) + min;
        }
    }
}
