package Exercises.Bst;

public class Leaf {
    private Leaf parent;
    private Leaf left;
    private Leaf right;
    int value;

    public Leaf() {

    }

    public Leaf(int value) {
        this.value = value;
    }

    public Leaf getParent() {
        return parent;
    }

    public void setParent(Leaf parent) {
        this.parent = parent;
    }

    public Leaf getLeft() {
        return left;
    }

    public void setLeft(Leaf left) {
        this.left = left;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Leaf getRight() {
        return right;
    }

    public void setRight(Leaf right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Leaf " +value;
    }
}
