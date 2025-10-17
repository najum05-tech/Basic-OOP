package Car;
import java.util.Scanner;
class Car {
    String carName;
    String direction;
    int position;

    Car(String carName, String direction, int position){
        this.carName = carName;
        this.direction = direction;
        this.position = position;
    }

    void turn()
    {
        switch(direction)
        {
            case "N":
                direction = "E";
                break;
            
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
            default:
                System.out.println("Invalid Direction");    
        }
    }

    void turn(String newDirection)
    {
        if(newDirection.equals("N") || newDirection.equals("E") || newDirection.equals("S") || newDirection.equals("W"))
        {
            direction = newDirection;
        }
        else
        {
            System.out.println("Invalid Direction");
        }
    }

    void move( int distance)
    {
        if(position<0)
        {
            System.out.println("Invalid Position");
            return;
        }
       
       position += distance;       
    }

    void display()
    {
        System.out.println("Car Name: " + carName);
        System.out.println("Direction: " + direction);
        System.out.println("Position: " + position);
    }

}
public class carMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Car Name: ");
        String name = input.nextLine();
        System.out.print("Enter Initial Direction: ");
        String dir = input.nextLine();
        System.out.print("Enter Initial Position: ");
        int pos = input.nextInt();

        Car myCar = new Car(name, dir, pos);

        myCar.turn();
        myCar.display();

    }
    
}
