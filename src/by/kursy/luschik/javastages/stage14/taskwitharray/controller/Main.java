package by.kursy.luschik.javastages.stage14.taskwitharray.controller;

import by.kursy.luschik.javastages.stage14.taskwitharray.model.logic.
        VerificationNew;
import by.kursy.luschik.javastages.stage14.taskwitharray.util.Initialization;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        Initialization.initConsole(array);

        String msg = String.format("Coordinates: %s", Arrays.toString(array));
        Printer.print(msg);

        Printer.print("\n" + VerificationNew.canRook(array));
    }
}
