package by.kursy.luschik.javastages.stage14.task.model.logic;

public class Verification {
    public static String moveRook(int x1, int y1, int x2, int y2) {
        String result = ((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2)) ?
                "YES" : "NO";

        return result;
    }
}
