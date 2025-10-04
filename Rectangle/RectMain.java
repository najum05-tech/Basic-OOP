package Rectangle;
class Rectangle 
{
    private double length = 1.0;
    private double width = 1.0;
public void setLength(double length)
{
    if(length>0.0 && length<=20.0)
    {
        this.length = length;
    }
    else {
        System.out.println("Invalid length");
    }
}

public double getLength()
{
    return length;
}
public void setwidth(double width)
{
    if(width>0.0 && width<=20.0)
    {
        this.width = width;
    }
    else{
        System.out.println("Invalid width");
    }
}

public double getWidth()
{
    return width;
}
double perimeter()
{
    return 2*(length+width);
}

double area()
{
    return length*width;
}

}
public class RectMain {
    public static void main(String[] args) {
        Rectangle react = new Rectangle();

        react.setLength(10.0);
        react.setwidth(5.0);

        System.out.println("Length: " + react.getLength()); 
        System.out.println("Width: " + react.getWidth());
        System.out.println("Perimeter: " + react.perimeter());
        System.out.println("Area: " + react.area());

       react.setLength(25.0);
       react.setwidth(-5.0);
    }
    
}
