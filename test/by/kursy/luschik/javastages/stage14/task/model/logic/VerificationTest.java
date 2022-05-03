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

}
