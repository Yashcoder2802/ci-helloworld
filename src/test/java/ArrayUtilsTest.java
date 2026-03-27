import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    void testFindLastNull() {
        assertThrows(NullPointerException.class, () -> ArrayUtils.findLast(null, 3));
    }

    @Test
    void testFindLastEmpty() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{}, 3));
    }

    @Test
    void testFindLastNonExistent() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{1, 2}, 3));
    }

    @Test
    void testFindLastExistsFirstElement() {
        assertEquals(0, ArrayUtils.findLast(new int[]{2, 3, 5}, 2));
    }

    @Test
    void testOddOrPosNull() {
        assertThrows(NullPointerException.class, () -> ArrayUtils.oddOrPos(null));
    }

    @Test
    void testOddOrPosAllPositives() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{1, 2, 3}));
    }

    @Test
    void testOddOrPositiveBothPositivesAndNegatives() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{-3, -2, 0, 1, 4}));
    }

    @Test
    void countOfReturnsZeroWhenEmpty() {
        assertEquals(0, ArrayUtils.countOf(new int[]{}, 5));
    }

    @Test
    void countOfCountsSingleOccurrence() {
        assertEquals(1, ArrayUtils.countOf(new int[]{1, 2, 3}, 2));
    }

    @Test
    void countOfCountsMultipleOccurrences() {
        assertEquals(3, ArrayUtils.countOf(new int[]{4, 2, 2, 5, 2}, 2));
    }

    @Test
    void countOfHandlesNoMatches() {
        assertEquals(0, ArrayUtils.countOf(new int[]{7, 8, 9}, 2));
    }
}
