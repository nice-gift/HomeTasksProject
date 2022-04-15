package by.kursy.luschik.javastages.stage12.taskA1.controller;

import by.kursy.luschik.javastages.stage12.util.ArrayInitializer;
import by.kursy.luschik.javastages.stage12.util.ArrayInitializerVarArgs;
import by.kursy.luschik.javastages.stage12.util.Convertor;
import by.kursy.luschik.javastages.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size=0;
        do {
            Printer.print("Input size of array: ");
            size= scanner.nextInt();
        } while (size<0);
        double[]array=new double[size];
//        ArrayInitializer.consoleInit(array);
//Printer.print("\n Array: "+ Convertor.convert(array));

//ArrayInitializer.rndInit(array);
//        Printer.print("\nArray: "+ Convertor.convert(array));

        ArrayInitializerVarArgs.rndInit(array);
        Printer.print("\nArray: "+ Convertor.convert(array));
    }
}
