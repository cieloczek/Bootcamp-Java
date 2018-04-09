package figures;

import java.util.List;

public class Rectangle extends ShapesApp implements Shape{
    private String name = "Rectangle";
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int area(){
        return x*y;
    }
    public int circ(){
        return 2*x+2*y;
    }
    public double diagonal(){
        return Math.sqrt(x^2+y^2);
    }
}
