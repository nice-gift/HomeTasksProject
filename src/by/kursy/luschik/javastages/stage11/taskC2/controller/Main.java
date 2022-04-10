package by.kursy.luschik.javastages.stage11.taskC2.controller;

import by.kursy.luschik.javastages.stage11.taskC2.modellogic.Manager;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Printer.print("Armstrong Numbers");
        int num_dig = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            Printer.print("\nEnter a number of digits from 2 to 5: ");
            num_dig = scanner.nextInt();
        } while (num_dig < 2 || num_dig > 5);

        String msg = Manager.getArmstrongNumbers(num_dig);
        msg = msg == "" ? "There isn't any Armstrong Numbers" :
                "Armstrong Numbers: " + msg;
        Printer.print(msg);
    }
}