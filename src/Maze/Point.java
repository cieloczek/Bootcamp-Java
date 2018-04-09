package Maze;

public class Point {
    private int x;
    private int y;

    public Point(int y, int x) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = getX();
        this.y = getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
