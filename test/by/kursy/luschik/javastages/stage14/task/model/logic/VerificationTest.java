package by.kursy.luschik.javastages.stage14.task.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class VerificationTest {

    @Test
    public void testMoveRookNegativeScenery() {
        int[] x1 = {3, 3, 3, 3, 3, 3, 3, 3};
        int[] y1 = {4, 4, 4, 4, 4, 4, 4, 4};
        int[] x2 = {4, 4, 2, 2, 1, 1, 6, 7};
        int[] y2 = {5, 3, 5, 3, 2, 6, 1, 8};
        String expected = "NO";

        for (int i = 0; i < x1.length; i++) {
            String actual = Verification.moveRook(x1[i], y1[i], x2[i], y2[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testMoveRookPositiveScenery() {
        int[] x1 = {3, 3, 3, 3, 3, 3, 3, 3};
        int[] y1 = {4, 4, 4, 4, 4, 4, 4, 4};
        int[] x2 = {4, 2, 1, 8, 3, 3, 3, 3};
        int[] y2 = {4, 4, 4, 4, 3, 5, 1, 8};
        String expected = "YES";

        for (int i = 0; i < x1.length; i++) {
            String actual = Verification.moveRook(x1[i], y1[i], x2[i], y2[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testMoveRookCoordinateNoChange() {
        int x1 = 3;
        int y1 = 4;
        int x2 = 3;
        int y2 = 4;
        String expected = "NO";

        String actual = Verification.moveRook(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }

    @Test(timeout = 1)
    public void testMoveRookByTimeout() {
        int x1 = 3;
        int y1 = 4;
        int x2 = 8;
        int y2 = 4;

        Verification.moveRook(x1, y1, x2, y2);
    }

    @Test
    public void testMoveKingNegativeScenery() {
        int[] x1 = {5, 5, 5, 5, 5, 5, 5, 5};
        int[] y1 = {3, 3, 3, 3, 3, 3, 3, 3};
        int[] x2 = {5, 3, 3, 7, 3, 1, 7, 7};
        int[] y2 = {5, 3, 5, 1, 1, 7, 5, 3};
        String expected = "NO";

        for (int i = 0; i < x1.length; i++) {
            String actual = Verification.moveKing(x1[i], y1[i], x2[i], y2[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testMoveKingPositiveScenery() {
        int[] x1 = {5, 5, 5, 5, 5, 5, 5, 5};
        int[] y1 = {3, 3, 3, 3, 3, 3, 3, 3};
        int[] x2 = {5, 5, 4, 6, 4, 4, 6, 6};
        int[] y2 = {2, 4, 3, 3, 2, 4, 2, 4};
        String expected = "YES";

        for (int i = 0; i < x1.length; i++) {
            String actual = Verification.moveKing(x1[i], y1[i], x2[i], y2[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testMoveKingCoordinateNoChange() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 5;
        int y2 = 3;
        String expected = "NO";

        String actual = Verification.moveKing(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }

    @Test
    public void testMoveQueenNegativeScenery() {
        int[] x1 = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int[] y1 = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int[] x2 = {1, 2, 4, 4, 4, 6, 6, 7, 7, 7, 8};
        int[] y2 = {1, 4, 1, 5, 8, 1, 5, 2, 4, 7, 8};
        String expected = "NO";

        for (int i = 0; i < x1.length; i++) {
            String actual = Verification.moveQueen(x1[i], y1[i], x2[i], y2[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testMoveQueenPositiveScenery() {
        int[] x1 = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int[] y1 = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int[] x2 = {1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8};
        int[] y2 = {7, 3, 6, 1, 5, 2, 3, 4, 1, 2, 4, 8, 2, 3, 4, 1, 5, 3, 6};
        String expected = "YES";

        for (int i = 0; i < x1.length; i++) {
            String actual = Verification.moveQueen(x1[i], y1[i], x2[i], y2[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testMoveQueenCoordinateNoChange() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 5;
        int y2 = 3;
        String expected = "NO";

        String actual = Verification.moveQueen(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }

    @Test
    public void testMoveHorseNegativeScenery() {
        int[] x1 = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int[] y1 = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int[] x2 = {3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 8};
        int[] y2 = {1, 3, 5, 2, 3, 4, 2, 4, 3, 1, 3, 5, 4};
        String expected = "NO";

        for (int i = 0; i < x1.length; i++) {
            String actual = Verification.moveHorse(x1[i], y1[i], x2[i], y2[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testMoveHorsePositiveScenery() {
        int[] x1 = {5, 5, 5, 5, 5, 5, 5, 5};
        int[] y1 = {3, 3, 3, 3, 3, 3, 3, 3};
        int[] x2 = {3, 3, 4, 4, 6, 6, 7, 7};
        int[] y2 = {2, 4, 1, 5, 1, 5, 2, 4};
        String expected = "YES";

        for (int i = 0; i < x1.length; i++) {
            String actual = Verification.moveHorse(x1[i], y1[i], x2[i], y2[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testMoveHorseCoordinateNoChange() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 5;
        int y2 = 3;
        String expected = "NO";

        String actual = Verification.moveHorse(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }

    @Test
    public void testMoveElephantNegativeScenery() {
        int[] x1 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] y1 = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        int[] x2 = {1, 1, 1, 2, 2, 3, 4, 5, 6, 8, 8, 8};
        int[] y2 = {1, 4, 8, 3, 5, 4, 3, 5, 3, 1, 4, 8};
        String expected = "NO";

        for (int i = 0; i < x1.length; i++) {
            String actual = Verification.moveElephant(x1[i], y1[i], x2[i], y2[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testMoveElephantPositiveScenery() {
        int[] x1 = {2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] y1 = {4, 4, 4, 4, 4, 4, 4, 4, 4};
        int[] x2 = {1, 1, 3, 3, 4, 4, 5, 5, 6};
        int[] y2 = {3, 5, 3, 5, 2, 6, 1, 7, 8};
        String expected = "YES";

        for (int i = 0; i < x1.length; i++) {
            String actual = Verification.moveElephant(x1[i], y1[i], x2[i], y2[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testMoveElephantCoordinateNoChange() {
        int x1 = 2;
        int y1 = 4;
        int x2 = 2;
        int y2 = 4;
        String expected = "NO";

        String actual = Verification.moveElephant(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }
}
