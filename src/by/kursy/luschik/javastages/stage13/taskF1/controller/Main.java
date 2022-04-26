package by.kursy.luschik.javastages.stage13.taskF1.controller;

import by.kursy.luschik.javastages.stage13.taskF1.modellogic.ArraySorter;
import by.kursy.luschik.javastages.stage13.taskF1.modellogic.Bound;
import by.kursy.luschik.javastages.stage13.util.ArrayInitDouble;
import by.kursy.luschik.javastages.stage13.util.Convertor;
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
        double[] array = new double[size];
        ArrayInitDouble.consoleInit(array);
        Printer.print("Your numbers: " + Convertor.convert(array));
        int indexFirst0 = Bound.getIndexFirst0(array);
        ArraySorter.insertedSortDsc(indexFirst0, array);
        Printer.print("\nNumbers after sorting until the first element, " +
                "equals 0:\n" + Convertor.convert(array));
        int indexLast0 = Bound.getIndexLast0(array);
        ArraySorter.insertedSortDsc(indexLast0, array);
        Printer.print("\nNumbers after sorting until the last element, " +
                "equals 0:\n" + Convertor.convert(array));
    }
}
