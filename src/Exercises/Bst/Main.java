package Exercises.Bst;

public class Main {
    public static void main(String[] args) {
        MyBst myBst = new MyBst();
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        myBst.add(input);
        System.out.println(myBst.search(9));
    }
}
