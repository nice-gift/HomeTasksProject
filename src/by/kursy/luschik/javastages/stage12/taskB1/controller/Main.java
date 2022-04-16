package by.kursy.luschik.javastages.stage12.taskB1.controller;

import by.kursy.luschik.javastages.stage12.taskB1.modellogic.Sorting;
import by.kursy.luschik.javastages.stage12.util.ArrayInitializerVarArgs;
import by.kursy.luschik.javastages.stage12.util.Convertor;
import by.kursy.luschik.javastages.view.Printer;

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
        Printer.print("\nArray: " + Convertor.convert(array));

        boolean result = Sorting.isNumsSorted(array);

        String msg = result ? "Yes" : "No";
        Printer.print("\nResult: " + msg);
    }
}
