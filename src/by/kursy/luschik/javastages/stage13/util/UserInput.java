package by.kursy.luschik.javastages.stage13.util;

import by.kursy.luschik.javastages.view.Printer;

import java.util.Scanner;

public class UserInput {
    public static int input(String msg) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            Printer.print(msg);
            size = scanner.nextInt();
        } while (size < 1);
        return size;
    }
}
