import java.util.Scanner;

class Building {
   public int floors;
   public double area;
   public int occupants;


   double areaperperson()
   {
     if(occupants == 0){
        return 0;
     }
     else{
        return area/occupants;
     }
   }
}



public class Buildingmain {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of floors= ");
        int housefloors = input.nextInt();
        System.out.print("Enter area= ");
        double housearea = input.nextDouble(); 
        System.out.print("Enter number of occupants= ");
        int houseoccupants = input.nextInt();


        Building house = new Building();
        house.floors = housefloors;
        house.area = housearea;
        house.occupants = houseoccupants;
        
        
        System.out.println("\nDetails of office building \n");

        System.out.print("Enter number of floors= ");
        int officefloors = input.nextInt();
        System.out.print("Enter area= ");
        double officearea = input.nextDouble();
        System.out.print("Enter number of occupants= ");
        int officeoccupants = input.nextInt();



        Building office = new Building();
        office.floors = officefloors;
        office.area = officearea;
        office.occupants = officeoccupants;


        System.out.print("\nArea per person in house= " + house.areaperperson() + " Sq.ft");
        System.out.print("\nArea per person in office= " + office.areaperperson() + " Sq.ft");
    }
}
