package Triangle;

import java.util.Scanner;

class Triangle{

    private double height;
    private double base;

    Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    public void setHeight( double x)
    {
        height = x;
    }
    public double getHeight(){
        return height;
    }

    public void setBase( double y)
    {
        base = y;
    }
    public double getBase(){
        return base;
    }

    public double area()
    {
        return 0.5 * base * height;
    }
}

public class triangleMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        double height = input .nextDouble();
        System.out.print("Enter the base of the triangle: ");
        double base = input .nextDouble();

        Triangle triangle = new Triangle(height, base);
        System.out.println("The area of the triangle is: " + triangle.area());
    }
    
}
