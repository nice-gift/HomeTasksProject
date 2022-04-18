package by.kursy.luschik.javastages.stage12.taskB5.controller;

import by.kursy.luschik.javastages.stage12.taskB5.initializer.ArrayInitializerMarks;
import by.kursy.luschik.javastages.stage12.taskB5.modellogic.ExamResult;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Scanner;

public class Main {
    public static final int FIVES = 5;
    public static final int FOURS = 4;
    public static final int TRIPLETS = 3;
    public static final int DEUCES = 2;
    public static final int UNITS = 1;
    public static final int ZEROS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        Printer.print("Exam Result Handling");

//  не смог создать массив из оценок, без предварительного ввода их кол-ва :(
        do {
            Printer.print("\nInput quantity of marks: ");
            size = scanner.nextInt();
        } while (size < 1);
        int[] array = new int[size];

        ArrayInitializerMarks.consoleInitInt(array);
        Printer.print("\nExam Result:");
        Printer.print("\nfives - " + ExamResult.findPercentage(FIVES, array));
        Printer.print("\nfours - " + ExamResult.findPercentage(FOURS, array));
        Printer.print("\ntriplets - " + ExamResult.findPercentage(TRIPLETS,
                array));
        Printer.print("\ndeuces - " + ExamResult.findPercentage(DEUCES,
                array));
        Printer.print("\nunits - " + ExamResult.findPercentage(UNITS, array));
        Printer.print("\nzeros - " + ExamResult.findPercentage(ZEROS, array));
    }
}
