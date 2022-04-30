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
    }
}
