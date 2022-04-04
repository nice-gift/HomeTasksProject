package by.kursy.luschik.javastages.stage11.taskC1.modellogic;

public class Manager {
    public static int getGreatestCommonDivisor(int number1, int number2) {
        int gsd = 1;
        int min = number1 < number2 ? number1 : number2;
        for (int i = min; i > 1; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                gsd = i;
                break;
            }
        }
        return gsd;
    }

    public static int getLeastCommonMultiple(int number1, int number2) {
        int lcm = 1;
        int min = number1 < number2 ? number1 : number2;
        for (int i = 2; i <min; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                lcm = i;
                break;
            }
        }
        return lcm;
    }
}
