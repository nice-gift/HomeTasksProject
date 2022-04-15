package by.kursy.luschik.javastages.stage11.taskC3.modellogic;

public class Manager {
    public static int countOfHappyTickets(int count_num_ticket) {
        int count_happy_ticket = 0;
        int min = 10;
        int max = (int) Math.pow(10, count_num_ticket);
        for (int i = min; i < max; i++) {
            int sum_of_second_half = 0;
            int sum_of_first_half = 0;
            int ji = i;
            for (int j = 1; j <= count_num_ticket / 2; j++) {
                int digit1 = ji % 10;
                sum_of_first_half += digit1;
                ji /= 10;
            }
            int ki = i / (int) Math.pow(10, (count_num_ticket+1)/2);

            while (ki > 0) {
                int digit2 = ki % 10;
                sum_of_second_half += digit2;
                ki /= 10;
            }


            if (sum_of_first_half == sum_of_second_half) {
                count_happy_ticket++;
            }
        }

        return count_happy_ticket;
    }
}
