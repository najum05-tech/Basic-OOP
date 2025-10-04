package Result;
import java.util.Scanner;
class Result{
    int rollno;
    String name;
    double[] marks = new double[3];

void  input()
{
    Scanner in = new  Scanner(System.in);
    System.out.print("Enter roll no= ");
    rollno = in.nextInt();
    System.out.print("Enter name= ");
    name = in.next();

    for (int i = 0; i < 3; i++) {
        
        System.out.print("Enter marks of subject "+(i+1)+" =");
        marks[i]= in.nextDouble();
    }
     
}

void  show()
{
    System.out.println("\nRoll no= " +rollno);
    System.out.println("Name= " +name);   
    for (int i = 0; i < 3; i++) {
        System.out.println("Marks of subject"+(i+1)+" = " +marks[i]);
    }

}

double totalmarks()
{
    double total=0;
    for (int i=0;i<3;i++)
    {
        total= total+marks[i];
    }
    return total;
}

double averagemarks()
{
    return totalmarks()/3;
}

}

public class Resultmain {
    public static void main(String[] args) {

        Result student  = new Result();
        student.input();
        student.show();

        System.out.println("\nTotal marks= "+student.totalmarks());
        System.out.println("Average marks= "+student.averagemarks());
        

    }
    
}
