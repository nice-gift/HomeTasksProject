package by.kursy.luschik.javastages.stage14.task.model.logic;

public class Verification {
    public static String moveRook(int x1, int y1, int x2, int y2) {

        return ((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2)) ?
                "YES" : "NO";
    }

    public static String moveKing(int x1, int y1, int x2, int y2) {

        return x2 == x1 && (y2 == y1 - 1 || y2 == y1 + 1) ? "YES" :
                (x2 == x1 + 1 || x2 == x1 - 1) && (y2 == y1 - 1 ||
                        y2 == y1 + 1 || y2 == y1) ? "YES" : "NO";
    }

    public static String moveElephant(int x1, int y1, int x2, int y2) {

        return ((x1 - y1 == x2 - y1) || (x1 + y1 == x2 + y2)) ?
                "YES" : "NO";
    }

    public static String moveQueen(int x1, int y1, int x2, int y2) {

        return ((x1 - y1 == x2 - y1) || (x1 + y1 == x2 + y2)
                || (x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2)) ?
                "YES" : "NO";
    }

    public static String moveHorse(int x1, int y1, int x2, int y2) {

        return (x2 == x1 + 2 || x2 == x1 - 2) && (y2 == y1 + 1 || y2 == y1 - 1)
                ? "YES" : (x2 == x1 + 1 || x2 == x1 - 1) && (y2 == y1 + 2 ||
                y2 == y1 - 2) ? "YES" : "NO";
    }

}
