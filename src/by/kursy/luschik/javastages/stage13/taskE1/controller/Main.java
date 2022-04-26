package by.kursy.luschik.javastages.stage13.taskE1.controller;

import by.kursy.luschik.javastages.stage13.taskE1.modellogic.Manager;
import by.kursy.luschik.javastages.stage13.util.ArrayInitDouble;
import by.kursy.luschik.javastages.stage13.util.Convertor;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            Printer.print("Enter a number of element: ");
            size = scanner.nextInt();
        } while (size < 1);
        double[] array = new double[size];
        ArrayInitDouble.rndInitDouble(array);
        Printer.print("Your numbers: " + Convertor.convert(array));
        int indexMin = Manager.getMIn(array);
        int indexMax = Manager.getMax(array);
        String msg = String.format("Min element has index %d, max - %d. " +
                "Product of elements located between the minimum and maximum" +
                " - %.2f", indexMin, indexMax, Manager.productNums(indexMin,
                indexMax, array));
        Printer.print("\n" + msg);
    }
}
