package RectanglesFromFile;

import java.io.*;
import java.lang.management.BufferPoolMXBean;
import java.util.ArrayList;

public class Rectangle {
    int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void calculateArea() {
        System.out.println("Area is: "+height*width);
    }

    public static void main(String... args) throws IOException {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        fillArrayList(rectangles);
        printRectangles(rectangles);
    }

    public static void fillArrayList(ArrayList<Rectangle> rectangles) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/RectanglesFromFile/rectangle_data.txt"));

        String s = null;

        while((s = br.readLine()) != null) {
            String[] line = s.split(" ");

            int width = Integer.parseInt(line[0]);
            int height = Integer.parseInt(line[1]);

            Rectangle r = new Rectangle(width, height);
            rectangles.add(r);
        }
    }

    public static void printRectangles(ArrayList<Rectangle> rectangles) {
        for(Rectangle r : rectangles) {
            r.calculateArea();
        }
    }
}
