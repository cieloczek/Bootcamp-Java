package figures;

import org.w3c.dom.css.Rect;

public class ShapesApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(24,42);
        showRect(rectangle);
        Square sq = new Square(5);
        showSquare(sq);

        Shape newSquare = new Square(4);

        Shape[] shapes = {new Square(4), new Rectangle(23,21), new Diamond(23,24)};
        showShapes(shapes);
    }    private static void showShapes(Shape[] shape){

        for (int i = 0; i <shape.length ; i++) {
            if(shape[i] instanceof Diamond){
                shape[i] = (Diamond) shape[i];
                System.out.println("\n\n\nheuheuhuehue");
            }
            System.out.println("\n");
            System.out.println(shape[i].getName());
            System.out.println("Field : " + shape[i].area());
            System.out.println("Circumference : " + shape[i].circ());
            System.out.println("Diagonal : " + shape[i].diagonal());
        }
    }
    private static void showRect(Rectangle rectangle){
        System.out.println("Field : " + rectangle.area());
        System.out.println("Circumference : " + rectangle.circ());
        System.out.println("Diagonal : " + rectangle.diagonal());
    }
    private static void showSquare(Square square){
        System.out.println("Field " + square.area());
        System.out.println("Area " + square.circ());
        System.out.println("Diagonal " + square.diagonal());
    }
}

