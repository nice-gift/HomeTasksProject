package by.kursy.luschik.javastages.stage13.taskD1.modellogic;

public class Verify {
    public static boolean verifyAllNumsAreDif(int... arrays) {
        for (int i = 0; i < arrays.length-1; i++) {

            for (int j = i+1; j < arrays.length ; j++) {
                if (arrays[i] == arrays[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
