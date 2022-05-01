package by.kursy.luschik.javastages.stage14.task.util;

import by.kursy.luschik.javastages.view.Printer;

import java.util.Scanner;

public class Initialization {
    public static int input(String msg) {
        Scanner scanner = new Scanner(System.in);

        int coordinate;

        do {
            Printer.print(msg);
            coordinate = scanner.nextInt();
        } while (coordinate < 1 || coordinate > 8);

        return coordinate;
    }
}

