

import java.util.Scanner;

class Student {
    int id;
    String name;
    double[] marks = new double[3];

double calculateTotal()
{
    double total = 0;
    for(int i=0; i<3; i++){
        total += marks[i];
    }
    return total;
}
double calculateAverage()
{
    return calculateTotal() / 3.0;
}

char calculateGrade(){
    double average = calculateAverage();
    if(average >= 90) 
    {
        return 'A';
    }
    else if(average >= 80) 
    {
        return 'B';
    }
    else if(average >= 70) 
    {
        return 'C';
    }
    else if(average >= 60) 
    {
        return 'D';
    }
    else 
    {
        return 'F';
    }
}
}

public class studentMain {
 public static void main(String[] args) {
     

    Scanner input = new Scanner(System.in);
    Student[] students = new Student[3];
    
    for(int i= 0; i<students.length; i++){
        students[i] = new Student();
        System.out.print("Enter Student "+ (i+1)+" ID: ");
        students[i].id = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter Student "+ (i+1)+" Name: ");
        students[i].name = input.nextLine();
        for(int j = 0; j<3; j++){
            System.out.print("Enter marks of student "+ (i+1) +" for subject " + (j+1) + ": ");
            students[i].marks[j] = input.nextDouble();
        }
       
    }

    System.out.println("\nStudent Results:");

    System.out.printf("%-10s %-20s %-15s %-15s %-10s\n", "ID", "Name", "Total Marks", "Average Marks", "Grade");
    for(Student student : students){
        System.out.printf("%-10d %-20s %-15.2f %-15.2f %-10c\n", student.id, student.name, student.calculateTotal(),student.calculateAverage(), student.calculateGrade());

    }

    
    
   
    
 }
    
}
