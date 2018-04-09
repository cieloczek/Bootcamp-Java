package figures;

public class Square extends ShapesApp implements Shape{
    private int a;
    String name = "Square";

    public Square(int a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String getName() {
        return name;
    }

    public int area(){
        int x = a^2;
        return x;
}
    public int circ(){
        int x = 4*a;
        return x;
    }
    public double diagonal(){
        return Math.sqrt(2)*a;
    }

}
