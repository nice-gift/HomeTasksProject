package by.kursy.luschik.javastages.stage12.util;

import by.kursy.luschik.javastages.view.Printer;

import java.util.Random;
import java.util.Scanner;

public class ArrayInitializerVarArgs {
    public static void rndInit (double...arrays)
    {Scanner scanner= new Scanner(System.in);
        Random random= new Random();
        Printer.print("Input min value of random: ");
        double min= scanner.nextDouble();
        Printer.print("Input max value of random: ");
        double max= scanner.nextDouble();
        for (int i = 0; i < arrays.length; i++) {
            arrays [i]=(min+(max-min)*random.nextDouble());
        }
    }

    public static void consoleInit (double...arrays){
        Scanner scanner= new Scanner(System.in);
        Printer.print("Input array elements: ");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i]= scanner.nextDouble();
        }
    }
}
