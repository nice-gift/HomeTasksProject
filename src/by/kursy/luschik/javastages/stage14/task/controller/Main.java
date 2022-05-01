package by.kursy.luschik.javastages.stage14.task.controller;

import by.kursy.luschik.javastages.view.Printer;

import static by.kursy.luschik.javastages.stage14.task.model.logic.Verification.*;
import static by.kursy.luschik.javastages.stage14.task.util.Initialization.input;

public class Main {
    public static void main(String[] args) {
        final int x1 = input("Input the starting coordinate X of the chess piece: ");
        final int y1 = input("Input the starting coordinate Y of the chess piece: ");
        final int x2 = input("Input the final coordinate X of the chess piece: ");
        final int y2 = input("Input the final coordinate Y of the chess piece: ");

        Printer.print("\nRook: " + moveRook(x1, y1, x2, y2));

        Printer.print("\nKing: " + moveKing(x1, y1, x2, y2));

        Printer.print("\nElephant: " + moveElephant(x1, y1, x2, y2));

        Printer.print("\nQueen: " + moveQueen(x1, y1, x2, y2));

        Printer.print("\nHorse: " + moveHorse(x1, y1, x2, y2));
    }
}
