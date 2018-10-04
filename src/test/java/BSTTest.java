import org.junit.Test;
import static org.junit.Assert.*;

public class BSTTest {
    @Test public void testInorderTraversal() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();
        // test.add(actual);
        // assertEquals(test.get(0), actual);
    }
}
