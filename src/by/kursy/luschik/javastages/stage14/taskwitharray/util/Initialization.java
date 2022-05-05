package by.kursy.luschik.javastages.stage14.taskwitharray.util;

import by.kursy.luschik.javastages.view.Printer;

import java.util.Scanner;

public class Initialization {
    public static void initConsole(int[] array) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input starter and final coordinates of the chess " +
                "piece: ");

        for (int i = 0; i < array.length; i++) {
            do {
                array[i] = scanner.nextInt();
            }
            while (array[i] < 1 || array[i] > 8);
        }
    }
}