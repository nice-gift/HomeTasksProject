package by.kursy.luschik.javastages.stage14.taskwitharray.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class VerificationNewTest {

    @Test
    public void testCanRookNegativeScenery() {

        int[][] array = {
                {3, 4, 4, 5},
                {3, 4, 4, 3},
                {3, 4, 2, 5},
                {3, 4, 2, 3},
                {3, 4, 1, 2},
                {3, 4, 1, 6},
                {3, 4, 6, 1},
                {3, 4, 7, 8}
        };

        String expected = "NO";

        for (int i = 0; i < array.length; i++) {
            assertEquals(expected, VerificationNew.canRook(array[i]));
        }
    }

    @Test
    public void testCanRookPositiveScenery() {
        int[][] array = {
                {3, 4, 4, 4},
                {3, 4, 2, 4},
                {3, 4, 1, 4},
                {3, 4, 8, 4},
                {3, 4, 3, 3},
                {3, 4, 3, 5},
                {3, 4, 3, 1},
                {3, 4, 3, 8}
        };

        String expected = "YES";

        for (int i = 0; i < array.length; i++) {
            assertEquals(expected, VerificationNew.canRook(array[i]));
        }
    }

    @Test
    public void testCanRookCoordinateNoChange() {
        int[] array = {3, 4, 4, 3};

        String expected = "NO";

        assertEquals(expected, VerificationNew.canRook(array));
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testCanRookEmpty() {
        int[] array = {};

        VerificationNew.canRook(array);
    }

    @Test (expected = NullPointerException.class)
    public void testCanRookNull() {
        int[] array = null;

        VerificationNew.canRook(null);
    }

}
