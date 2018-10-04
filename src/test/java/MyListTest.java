import org.junit.Test;
import static org.junit.Assert.*;

public class MyListTest {
    @Test public void testListCanAdd() {
        MyList<Integer> test = new MyList<Integer>();
        Integer actual = 0;
        test.add(actual);
        assertEquals(test.get(0), actual);
    }
}
