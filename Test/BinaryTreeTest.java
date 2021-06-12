import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {


    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeNotEmpty() {

        BinaryTree bt = createBinaryTree();
        assertFalse(bt.isEmpty());
    }
    @Test
    public void add() {
    }

    @Test
    public void containsNode() {
    }

    @Test
    public void traverseInOrder() {
    }

    @Test
    public void traverseLevelOrder() {
    }

    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        return bt;
    }
}