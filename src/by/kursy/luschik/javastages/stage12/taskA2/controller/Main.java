package by.kursy.luschik.javastages.stage12.taskA2.controller;

import by.kursy.luschik.javastages.stage12.taskA2.modellogic.Change;
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

        ArrayInitializerVarArgs.rndInit(array);
        Printer.print("\nArray: " + Convertor.convert(array));

        Printer.print("\nAfter change: " +
                Change.changeOfPlacesExtremeValues(array));
    }
}
