package by.kursy.luschik.javastages.stage12.taskB5.initializer;

import by.kursy.luschik.javastages.view.Printer;

import java.util.Scanner;

public class ArrayInitializerMarks {
    public static void consoleInitInt (int...arrays){
        Scanner scanner= new Scanner(System.in);
        Printer.print("Marks: ");
        for (int i = 0; i < arrays.length; i++) {
            do {
                arrays[i]= scanner.nextInt();
            }while (arrays[i]<0||arrays[i]>5);
        }
    }
}
