package by.kursy.luschik.javastages.stage12.taskB4.controller;

import by.kursy.luschik.javastages.stage12.taskB4.modellogic.AdditionElements;
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

        String msg = String.format("\nResult of addition odd elements: %.2f",
                AdditionElements.SumOddNumsVector(array));
        Printer.print(msg);

        String msg1 = String.format("\nResult of addition even elements: %.2f",
                AdditionElements.SumEvenNumsVector(array));
        Printer.print(msg1);
    }
}
