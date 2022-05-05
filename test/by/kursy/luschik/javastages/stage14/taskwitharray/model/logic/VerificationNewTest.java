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
                {3, 4, 7, 8},
        };
        String expected = "NO";

        for (int i = 0; i < array.length; i++) {
            assertEquals(expected, VerificationNew.canRook(array[i]));
        }
    }

}
