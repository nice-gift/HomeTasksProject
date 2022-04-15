package by.kursy.luschik.javastages.stage12.util;

import by.kursy.luschik.javastages.view.Printer;

import java.util.Random;
import java.util.Scanner;

public class ArrayInitializer {
    public static void rndInit (int [] array, int min, int max){
        Random random= new Random();
        for (int i = 0; i < array.length; i++) {
            array [i]=random.nextInt((max-min +1)+ min);
        }
    }

    public static void consoleInit (int[]array){
        Scanner scanner= new Scanner(System.in);
        Printer.print("Input array elements");
        for (int i = 0; i < array.length; i++) {
            array[i]= scanner.nextInt();
        }
    }
}
