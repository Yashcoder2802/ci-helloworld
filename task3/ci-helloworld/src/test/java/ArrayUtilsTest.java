import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayUtilsTest {

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
