package figures;

public class Diamond extends ShapesApp implements Shape {
    private String name = "Diamond";
    private int a;
    private int b;

    public Diamond(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int area() {
        return 0;
    }

    @Override
    public int circ() {
        return 0;
    }

    @Override
    public double diagonal() {
        return 0;
    }
}
