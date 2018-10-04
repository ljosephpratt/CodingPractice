import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class SortTest {
    @Test public void testMergeSortWorks() {
        List<Integer> test = Arrays.asList(2, 5, 3, 4, 1);
        List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5);
        Sort sort = new Sort();
        List<Integer> expected = sort.mergeSort(test);
        assertEquals(expected.get(0), actual.get(0));
        assertEquals(expected.get(1), actual.get(1));
        assertEquals(expected.get(2), actual.get(2));
        assertEquals(expected.get(3), actual.get(3));
        assertEquals(expected.get(4), actual.get(4));
    }
}
