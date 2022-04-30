package by.kursy.luschik.javastages.stage13.taskF8.controller;

import by.kursy.luschik.javastages.stage13.taskF8.modellogic.Bound;
import by.kursy.luschik.javastages.stage13.util.ArrayInitInt;
import by.kursy.luschik.javastages.stage13.util.ArraySorter;
import by.kursy.luschik.javastages.stage13.util.UserInput;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = UserInput.input("Input a count of numbers: ");

        int[] array = new int[size];

        ArrayInitInt.consoleInit(array);

        Printer.print("Your numbers: " + Arrays.toString(array));

        int indexFirstOddNum = Bound.getIndexFirstOdd(array);
        ArraySorter.selectedSortAsc(indexFirstOddNum, array);

        Printer.print("\nNumbers after sorting by ascending until the first" +
                " odd element: " + Arrays.toString(array));

        int indexLastOddNum = Bound.getIndexLastOdd(array);
        ArraySorter.selectedSortAsc(indexLastOddNum, array);

        Printer.print("\nNumbers after sorting by ascending until the last" +
                " odd element: " + Arrays.toString(array));
    }
}
