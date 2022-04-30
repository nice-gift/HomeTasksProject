package by.kursy.luschik.javastages.stage13.taskA1.controller;

import by.kursy.luschik.javastages.stage13.taskA1.modellogic.Counter;
import by.kursy.luschik.javastages.stage13.util.ArrayInitInt;
import by.kursy.luschik.javastages.stage13.util.UserInput;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = UserInput.input("Enter a number of element: ");

        int[] array = new int[size];

//      ArrayInit.consoleInit(array);
        ArrayInitInt.rndInit(array);

        Printer.print("Your numbers: " + Arrays.toString(array));

        String msg = String.format("\nCount of not-null numbers: %d",
                Counter.countNotNull(array));
        Printer.print(msg);
    }
}
