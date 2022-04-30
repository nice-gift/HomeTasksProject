package by.kursy.luschik.javastages.stage13.taskD1.controller;

import by.kursy.luschik.javastages.stage13.taskD1.modellogic.Verify;
import by.kursy.luschik.javastages.stage13.util.ArrayInitInt;
import by.kursy.luschik.javastages.stage13.util.UserInput;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = UserInput.input("Enter a number of element: ");

        int[] array = new int[size];

        ArrayInitInt.consoleInit(array);

        Printer.print("Your numbers: " + Arrays.toString(array));

        String msg = Verify.verifyAllNumsAreDif(array) ? "All numbers " +
                "are different" : "There are repeated numbers";
        Printer.print("\n" + msg);
    }
}
