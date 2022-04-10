package by.kursy.luschik.javastages.stage11.taskC3.controller;

import by.kursy.luschik.javastages.stage11.taskC3.modellogic.Manager;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Printer.print("***Counting Happy Tickets***\n");
        Scanner scanner = new Scanner(System.in);
        int count_num_ticket = 0;
        do {
            Printer.print("Input a count of digits (from 4 to 10) in bus " +
                    "ticket number: ");
            count_num_ticket = scanner.nextInt();
        }
        while (count_num_ticket < 4 || count_num_ticket > 10);
        String msg = String.format("Count of happy tickets: %d",
                Manager.countOfHappyTickets(count_num_ticket));
        Printer.print(msg);
    }

}
