package by.kursy.luschik.javastages.stage11.taskC1.controller;

import by.kursy.luschik.javastages.stage11.taskC1.modellogic.Manager;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        do {
            Printer.print("Enter the first number: ");
            number1 = scanner.nextInt();
        } while (number1 < 1);
        do {
            Printer.print("Enter the second number: ");
            number2 = scanner.nextInt();
        }
        while (number2 < 1);

        String msg = String.format("GreatestCommonDivisor for numbers %d and" +
                        " %d is %d, LeastCommonMultiple - %d", number1,
                number2, Manager.getGreatestCommonDivisor(number1, number2
                ), Manager.getLeastCommonMultiple(number1, number2));
        Printer.print(msg);
    }
}
