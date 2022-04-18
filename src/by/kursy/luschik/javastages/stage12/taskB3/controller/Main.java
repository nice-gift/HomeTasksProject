package by.kursy.luschik.javastages.stage12.taskB3.controller;

import by.kursy.luschik.javastages.stage12.taskB3.modellogic.CompareNums;
import by.kursy.luschik.javastages.stage12.util.ArrayInitializerVarArgs;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            Printer.print("Input size of array: ");
            size = scanner.nextInt();
        } while (size < 1);
        double[] array = new double[size];

        ArrayInitializerVarArgs.consoleInit(array);
        Printer.print("\nArray: " +Arrays.toString(array));

        boolean result1 = CompareNums.isAllNumsTheSame(array);

        String msg1 = result1 ? "Yes" : "No";
        Printer.print("\nIs all numbers the same?\n" + msg1);

        boolean result2 = CompareNums.isAllNumsADifferent(array);

        String msg2 = result2 ? "Yes" : "No";
        Printer.print("\nIs all numbers a different?\n" + msg2);
    }
}
