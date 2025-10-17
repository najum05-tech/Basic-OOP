package Employee;
import java.util.Scanner;
class Employee {
    private int id;
    private String name;
    private int type; // 1=employee, 2=manager
    private double baseSalary;

    public Employee(int id, String name, int type, double baseSalary){
        this.id = id;
        this.name = name;
        this.type = type;
        this.baseSalary = baseSalary;
    }

    public void setId(int id){
        this.id = id;

    }
    public int getId(){
        return id;
    }   
    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
    public void setType(int type){
        this.type = type;

    }
    public int getType(){
        return type;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;

    }
    public double getBaseSalary(){
        return baseSalary;
    }

    public double calculateSalary(){
        if(type == 1){
            return baseSalary;
        }
        else if(type == 2){
            return baseSalary * 1.1; // Managers get a 10% bonus
        }
        else{
            System.out.println("Invalid Employee Type");
            return 0;
        }
    }


}

public class employeeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = input.nextInt();
        System.out.print("Enter Employee Name: ");
        String name = input.next();
        System.out.print("Enter Employee Type (1 for Employee, 2 for Manager): ");
        int type = input.nextInt();
        System.out.print("Enter Base Salary: ");
        double baseSalary = input.nextDouble();

        Employee emp = new Employee(id, name, type, baseSalary);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Type: " + (emp.getType()));
        System.out.println("Calculated Salary: " + emp.calculateSalary());

    }
    
}
