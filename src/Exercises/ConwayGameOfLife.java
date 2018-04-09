package Exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Transient;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import Maze.Point;


@SuppressWarnings("serial")
public class ConwayGameOfLife extends JPanel {

    private int[][] grid;
    private static final Random rnd = new Random();
    private int generationCounter;

    public ConwayGameOfLife(int width, int height) {
        this.grid = new int[width / 4][height / 4];
//        this.grid[10][10] = 1;

        for (int i = 0; i < width / 4; i++) {
            for (int j = 0; j < height / 4; j++) {
                int temp = ThreadLocalRandom.current().nextInt(100);
                if (temp > 52) {
                    grid[i][j] = 1;
                }
            }
        }
    }

    private void updateGrid() {
        java.util.List<Point> points = new ArrayList<>();
        points.add(new Point(-1,-1));
        points.add(new Point(-1,0));
        points.add(new Point(-1,1));
        points.add(new Point(0,1));
        points.add(new Point(1,1));
        points.add(new Point(1,0));
        points.add(new Point(1,-1));
        points.add(new Point(0,-1));
        int[][] tempGrid= new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int count = 0;
                for (Point point: points) {
                    if((i-point.getX()>0 && i-point.getX()<grid.length)
                            &&(j-point.getY()>0 && j-point.getY()<grid[0].length)
                            &&(grid[i-point.getX()][j-point.getY()]==1)){
                        count++;
                    }
                }
                if(count==3) tempGrid[i][j]=1;
                else if(grid[i][j]==1 && count==2) tempGrid[i][j]=1;
                else tempGrid[i][j]=0;

            }
        }
        grid=tempGrid;
    }

    @Override
    @Transient
    public Dimension getPreferredSize() {
        return new Dimension(grid.length * 4, grid[0].length * 4);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color gColor = g.getColor();

        g.drawString("Generation: " + generationCounter++, 0, 10);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    g.setColor(Color.red);
                    g.fillRect(j * 4, i * 4, 4, 4);
                }
            }
        }

        g.setColor(gColor);
    }

    public static void main(String[] args) {
        final ConwayGameOfLife c = new ConwayGameOfLife(800, 800);
        JFrame frame = new JFrame();
        frame.getContentPane().add(c);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.updateGrid();
                c.repaint();
            }
        }).start();
    }
}