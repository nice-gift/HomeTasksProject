package by.kursy.luschik.javastages.stage14.taskwitharray.model.logic;

public class VerificationNew {
    public static String canRook(int[] array) {
        int x1 = array[0];
        int y1 = array[1];
        int x2 = array[2];
        int y2 = array[3];

        return ((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2)) ?
                "YES" : "NO";
    }
}
