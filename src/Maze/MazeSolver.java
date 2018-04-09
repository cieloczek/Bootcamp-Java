package Maze;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class MazeSolver {
    public static void main(String[] args) {        //not working
        int[][] maze1 = {{1, 0, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 1}};
        int[][] maze2 = {
                {1, 0, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 0, 1, 0, 1},
                {1, 0, 0, 1, 0, 0},
                {1, 1, 0, 1, 0, 1},
                {1, 1, 1, 1, 0, 1}};
        findWayOut(maze2);
    }

    private static int findStart(int[] maze) {
        int i = 0;
        while (maze[i] == 0) {
            i++;
        }
        return i;
    }

    private static void findWayOut(int[][] maze) {
        Stack<Point> points = new Stack<>();
        int x = findStart(maze[0]);
        int y = 0;
        Point currentPoint = new Point(x, y);
        while (y != maze.length - 1) {
            if (maze[currentPoint.getY()][currentPoint.getX()] == 0 &&
                    !isOnStack(points, new Point(currentPoint.getY(),currentPoint.getX())))
            {
                currentPoint.setY(currentPoint.getY() + 1);
                points.push(new Point(currentPoint));

            } else if (maze[currentPoint.getY()][currentPoint.getX() + 1] == 0 &&
                    !isOnStack(points, new Point(currentPoint.getY(),currentPoint.getX()+1)))
            {
                currentPoint.setX(currentPoint.getX() + 1);
                points.push(new Point(currentPoint));

            } else if (maze[currentPoint.getY()][currentPoint.getX() - 1] == 0 &&
                    !isOnStack(points, new Point(currentPoint.getY(),currentPoint.getX()-1)))
            {
                currentPoint.setX(currentPoint.getX() - 1);
                points.push(new Point(currentPoint));

            } else if (maze[currentPoint.getY() - 1][currentPoint.getX()] == 0 &&
                    !isOnStack(points, new Point(currentPoint.getY()-1,currentPoint.getX())))
            {
                currentPoint.setY(currentPoint.getY() - 1);
                points.push(new Point(currentPoint));
            }else {
                Point fromStack = points.pop();
                maze[fromStack.getY()][fromStack.getX()] = 1;
                points.push(new Point(currentPoint));
            }
            System.out.println(currentPoint.getY() + " " + currentPoint.getX());
        }


    }

    public static boolean isOnStack(Stack<Point> stack, Point point) {
//      Point foundPoint = stack.stream().filter(point1 -> point1.getY()==point.getY() &&
//              point1.getX()==point.getX()).findAny().get();
        ListIterator<Point> pointListIterator = stack.listIterator();
        while (pointListIterator.hasNext()) {
            Point nextPoint = pointListIterator.next();
            if (nextPoint.equals(point)) {
                return true;
            }
        }
        return false;
    }
}




