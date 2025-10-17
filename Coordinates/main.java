package Coordinates;

import java.util.Scanner;

class Point {
    private double x;
    private double y;
    Point() {
        x = 0;
        y = 0;
    }
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    double distance(double x2, double y2) {
        double dx = x2 - x;
        double dy = y2 - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    void displayPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        System.out.print("Enter x for first point: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y for first point: ");
        double y1 = input.nextDouble();


        System.out.print("Enter x for second point: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y for second point: ");
        double y2 = input.nextDouble();

       
        Point p1 = new Point(x1, y1);

         System.out.print("First Point: ");
        p1.displayPoint();
        System.out.println("Second Point: (" + x2 + ", " + y2 + ")");

        double dist = p1.distance(x2, y2);
        System.out.println("Distance between the two points: " + dist);
    }
}
