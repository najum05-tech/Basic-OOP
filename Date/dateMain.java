package Date;
import java.util.Scanner;
class Date{
    int day;
    int month;
    int year;

public void displayDate()
{
    System.out.println("The date is: " + day + "/" + month + "/" + year);
}
}
public class dateMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        Date date = new Date();
        date.day = day;
        date.month = month;
        date.year = year;

        date.displayDate();
    }
}
