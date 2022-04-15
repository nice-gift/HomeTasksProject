package by.kursy.luschik.javastages.stage12.taskA4.modellogic;

public class Multiplication {
    public static double mltpValueWithOddIndex(double...arrays){
        double mltp=1;
        for (int i = 0; i <arrays.length ; i+=2) {
            if (arrays[i] >0) {
                mltp*=arrays[i];
            }
        }
    return mltp;
    }
}
