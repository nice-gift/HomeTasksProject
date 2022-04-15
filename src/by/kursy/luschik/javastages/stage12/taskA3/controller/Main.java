package by.kursy.luschik.javastages.stage12.taskA3.controller;

import by.kursy.luschik.javastages.stage12.taskA1.modellogic.ExtremeValues;
import by.kursy.luschik.javastages.stage12.taskA3.modellogic.Addition;
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

        Double avg = ExtremeValues.findAverage(array);

        String msg = String.format("\nSum of digits that are less than the " +
                        "average %.2f is %.2f",
                avg, Addition.sumDigitsThatLessAvg(avg, array));
        Printer.print(msg);
    }
}
