package by.kursy.luschik.javastages.stage13.taskE1.controller;

import by.kursy.luschik.javastages.stage13.taskE1.modellogic.Manager;
import by.kursy.luschik.javastages.stage13.util.ArrayInitDouble;
import by.kursy.luschik.javastages.stage13.util.Convertor;
import by.kursy.luschik.javastages.stage13.util.UserInput;
import by.kursy.luschik.javastages.view.Printer;

public class Main {
    public static void main(String[] args) {
        int size = UserInput.input("Enter a number of element: ");

        double[] array = new double[size];

        ArrayInitDouble.rndInitDouble(array);

        Printer.print("Your numbers: " + Convertor.convert(array));

        int indexMin = Manager.getMIn(array);
        int indexMax = Manager.getMax(array);

        String msg = String.format("Min element has index %d (%dth in a row)" +
                ", max - %d (%dth in a row). \nProduct of elements located " +
                "between the minimum and maximum - %.2f", indexMin, indexMin
                + 1, indexMax, indexMax + 1, Manager.productNums(indexMin,
                indexMax, array));
        Printer.print("\n" + msg);
    }
}
