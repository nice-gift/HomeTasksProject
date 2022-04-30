package by.kursy.luschik.javastages.stage13.taskF1.controller;

import by.kursy.luschik.javastages.stage13.taskF1.modellogic.Bound;
import by.kursy.luschik.javastages.stage13.util.ArrayInitDouble;
import by.kursy.luschik.javastages.stage13.util.ArraySorter;
import by.kursy.luschik.javastages.stage13.util.Convertor;
import by.kursy.luschik.javastages.stage13.util.UserInput;
import by.kursy.luschik.javastages.view.Printer;

public class Main {
    public static void main(String[] args) {
        int size = UserInput.input("Enter a number of element: ");

        double[] array = new double[size];

        ArrayInitDouble.consoleInit(array);

        Printer.print("Your numbers: " + Convertor.convert(array));

        int indexFirst0 = Bound.getIndexFirst0(array);
        ArraySorter.insertedSortDsc(indexFirst0, array);

        Printer.print("\nNumbers after sorting by descending until the first" +
                " element, equals 0:\n" + Convertor.convert(array));

        int indexLast0 = Bound.getIndexLast0(array);
        ArraySorter.insertedSortDsc(indexLast0, array);

        Printer.print("\nNumbers after sorting by descending until the last" +
                " element, equals 0:\n" + Convertor.convert(array));
    }
}
