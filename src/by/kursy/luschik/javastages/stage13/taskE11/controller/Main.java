package by.kursy.luschik.javastages.stage13.taskE11.controller;

import by.kursy.luschik.javastages.stage13.taskE11.modellogic.Manager;
import by.kursy.luschik.javastages.stage13.util.ArrayInitDouble;
import by.kursy.luschik.javastages.stage13.util.UserInput;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = UserInput.input("Input a count of numbers: ");

        double[] array = new double[size];

        ArrayInitDouble.consoleInit(array);

        Printer.print("Your numbers are: " + Arrays.toString(array));

        int indexMax = Manager.getMax(array);
        double sum = Manager.getSum(indexMax, array);
        String msg = String.format("\nThe sum of the elements after " +
                "the maximum %.1f: %.1f", array[indexMax], sum);
        Printer.print(msg);
    }
}
