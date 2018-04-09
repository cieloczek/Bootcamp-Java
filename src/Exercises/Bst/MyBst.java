package Exercises.Bst;

import java.util.Arrays;

public class MyBst {
    private Leaf root;
    private void addImpl (int [] array,Leaf leaf){
        int index = array.length /2;
        leaf.setValue(array[index]);
        int[] leftArray = Arrays.copyOfRange(array, 0, index);
        int[] rightArray = Arrays.copyOfRange(array, index + 1, array.length);
        if (leftArray.length != 0){
            Leaf leftLeaf = new Leaf();
            leaf.setLeft(leftLeaf);
            leftLeaf.setParent(leaf);
            addImpl(leftArray, leftLeaf);
        }
        if (rightArray.length != 0){
            Leaf rightLeaf = new Leaf();
            leaf.setRight(rightLeaf);
            rightLeaf.setParent(leaf);
            addImpl(rightArray, rightLeaf);
        }
    }

    public void add (int [] array){
        root = new Leaf();
        addImpl(array, root);
    }
    public Leaf search(int input){
        return search(input, root);
    }
    private Leaf search(int input, Leaf root) {
        if (input > root.getValue() && root.getLeft() != null) {
            return search(input, root.getLeft());
        } else if (input > root.getValue() && root.getRight() != null) {
            return search(input, root.getRight());
        } else if(input == root.getValue()){
            return root;
        }else{
            return null;
        }
    }
}