package by.kursy.luschik.javastages.stage13.taskF3.controller;

import by.kursy.luschik.javastages.stage13.taskF3.modellogic.Bound;
import by.kursy.luschik.javastages.stage13.util.ArrayInitDouble;
import by.kursy.luschik.javastages.stage13.util.ArraySorter;
import by.kursy.luschik.javastages.stage13.util.Convertor;
import by.kursy.luschik.javastages.stage13.util.UserInput;
import by.kursy.luschik.javastages.view.Printer;

public class Main {
    public static void main(String[] args) {
        int size = UserInput.input("Enter a number of element: ");

        double[] array = new double[size];

        ArrayInitDouble.rndInitDouble(array);

        Printer.print("Your numbers: " + Convertor.convert(array));

        int indexFirstNegative = Bound.getIndexFirstNegative(array);
        ArraySorter.selectedSortDsc(indexFirstNegative, array);

        Printer.print("\nNumbers after sorting by descending until the first" +
                " negative element: " + Convertor.convert(array));

        int indexLastNegative = Bound.getIndexLastNegative(array);
        ArraySorter.selectedSortDsc(indexLastNegative, array);

        Printer.print("\nNumbers after sorting by descending until the last " +
                "negative element: " + Convertor.convert(array));
    }
}
