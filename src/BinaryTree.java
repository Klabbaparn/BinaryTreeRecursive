import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.assertFalse;

public class BinaryTree {

    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null)
            return new Node(value);

        if (value < current.value) {
            current.leftChild = addRecursive(current.leftChild, value);
        } else if (value > current.value) {
            current.rightChild = addRecursive(current.rightChild, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        this.root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null)
            return false;
        if (value == current.value)
            return true;
        return value < current.value
                ? containsNodeRecursive(current.leftChild, value)
                : containsNodeRecursive(current.rightChild, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
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
        System.out.println("here");
        return bt;
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.leftChild);
            System.out.print(" " + node.value);
            traverseInOrder(node.rightChild);
        }
    }

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeNotEmpty() {

        BinaryTree bt = createBinaryTree();

        assertFalse(bt.isEmpty());
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.leftChild != null) {
                nodes.add(node.leftChild);
            }

            if (node.rightChild != null) {
                nodes.add(node.rightChild);
            }
        }
    }
}

class Node {
    int value;
    Node leftChild;
    Node rightChild;

    Node(int value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

}
