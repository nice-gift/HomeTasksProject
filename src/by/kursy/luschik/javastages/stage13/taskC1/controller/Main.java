package by.kursy.luschik.javastages.stage13.taskC1.controller;

import by.kursy.luschik.javastages.stage13.taskC1.modellogic.Counter;
import by.kursy.luschik.javastages.stage13.taskC1.modellogic.CounterAvg;
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

        double avg = CounterAvg.getAvg(array);

        String msg = String.format("\nCount of numbers bigger than average " +
                "%.2f: %d", avg, Counter.countNumsBiggerAvg(avg, array));
        Printer.print(msg);
    }
}

