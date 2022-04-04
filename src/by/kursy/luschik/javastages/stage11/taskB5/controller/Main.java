package by.kursy.luschik.javastages.stage11.taskB5.controller;

import by.kursy.luschik.javastages.stage11.taskB5.modellogic.Manager;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            Printer.print("Input a natural number: ");
            number = scanner.nextInt();
        }
        while (number < 1);
        String msg = String.format("Prime divider number %d is: %s",
                number, Manager.getPrimeDivider(number));
        Printer.print(msg);
    }
}