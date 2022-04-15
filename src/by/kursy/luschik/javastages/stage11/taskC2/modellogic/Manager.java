package by.kursy.luschik.javastages.stage11.taskC2.modellogic;

public class Manager {
    public static String getArmstrongNumbers(int num_dig) {
        String msg = "";
        int min = 10_000;
        int max = 100_000;
        switch (num_dig) {
            case 2:
                min = 10;
                max = 100;
                break;
            case 3:
                min = 100;
                max = 1_000;
                break;
            case 4:
                min = 1_000;
                max = 10_000;
                break;
        }

        for (int i = min; i < max; i++) {
            int sum = 0;
            int num = i;
            while (num > 0) {
                int digit = num % 10;
                int digit_to_the_pwr = 1;
                if (digit > 0) {
                    for (int j = 0; j < num_dig; j++) {
                        digit_to_the_pwr *= digit;
                    }
                }
                sum += digit_to_the_pwr;
                num /= 10;
            }
            if (sum == i) {
                msg += i + " ";
            }
        }
        return msg;
    }
}
