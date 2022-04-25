package by.kursy.luschik.javastages.stage13.util;

import by.kursy.luschik.javastages.view.Printer;

import java.util.Scanner;

public class ArrayInit {
    public static void consoleInit(int... arrays) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input any integers: ");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextInt();
        }
    }
}
