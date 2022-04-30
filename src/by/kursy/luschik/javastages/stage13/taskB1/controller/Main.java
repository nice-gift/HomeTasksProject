package by.kursy.luschik.javastages.stage13.taskB1.controller;

import by.kursy.luschik.javastages.stage13.taskB1.modellogic.Counter;
import by.kursy.luschik.javastages.stage13.util.ArrayInitInt;
import by.kursy.luschik.javastages.stage13.util.UserInput;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size = UserInput.input("Enter a number of element: ");

        int[] array = new int[size];

        ArrayInitInt.rndInit(array);

        Printer.print("Enter the number to be compared with the " +
                "elements of the array: ");
        int bound = scanner.nextInt();

        Printer.print("Your numbers: " + Arrays.toString(array));

        String msg = String.format("\nCount of numbers more than %d: %d",
                bound, Counter.countNumsGreater(bound, array));
        Printer.print(msg);
    }
}
