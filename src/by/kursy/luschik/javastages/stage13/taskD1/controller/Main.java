package by.kursy.luschik.javastages.stage13.taskD1.controller;

import by.kursy.luschik.javastages.stage13.taskD1.modellogic.Verify;
import by.kursy.luschik.javastages.stage13.util.ArrayInitInt;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            Printer.print("Enter a number of element: ");
            size = scanner.nextInt();
        } while (size < 1);
        int[] array = new int[size];
        ArrayInitInt.consoleInit(size, array);
        Printer.print("Your numbers: " + Arrays.toString(array));

        String msg = Verify.verifyAllNumsAreDif(array) ? "All numbers " +
                "are different" : "There are repeated numbers";
        Printer.print("\n"+msg);
    }
}
