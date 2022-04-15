package by.kursy.luschik.javastages.stage12.taskA1.controller;

import by.kursy.luschik.javastages.stage12.taskA1.modellogic.ExtremeValues;
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

//        ArrayInitializer.consoleInit(array);
//        Printer.print("\n Array: " + Convertor.convert(array));
//
//        ArrayInitializer.rndInit(array);
//        Printer.print("\nArray: " + Convertor.convert(array));

        ArrayInitializerVarArgs.rndInit(array);
        Printer.print("\nArray: " + Convertor.convert(array));

        String min_value = String.format("\nMin value is %.2f",
                ExtremeValues.findMin(array));
        Printer.print(min_value);

        String max_value = String.format("\nMax value is %.2f",
                ExtremeValues.findMax(array));
        Printer.print(max_value);

        String average = String.format("\nAverage is %.2f",
                ExtremeValues.findAverage(array));
        Printer.print(average);
    }
}
