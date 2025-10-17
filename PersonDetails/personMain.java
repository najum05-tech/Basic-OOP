package PersonDetails;
import java.util.Scanner;
class Date {
    int day;
    int month;
    int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

}

class Person{
   private  String personName;
   private  int personAge;
   private  Date personDob;

   Person(String personName, int personAge, Date personDob){
      this.personName = personName;
      this.personAge = personAge;
      this.personDob = personDob;
   }

    void setpersonName(String personName) {
        this.personName = personName;
    }

    String getpersonName() {
        return personName;
    }
    void setpersonAge(int personAge) {
        this.personAge = personAge;
    }
    int getpersonAge() {
        return personAge;
    }
    void setpersonDob(Date personDob) {
        this.personDob = personDob;
    }
    Date getpersonDob() {
        return personDob;
    }
    void  displayPerson()
    {
         System.out.println("Name: " + personName);
        System.out.println("Age: " + personAge);
        System.out.print("Date of Birth: ");
        personDob.displayDate();
        System.out.println();
    }
}

public class personMain {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);

      System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter day of birth: ");
        int day = input.nextInt();

        System.out.print("Enter month of birth: ");
        int month = input.nextInt();

        System.out.print("Enter year of birth: ");
        int year = input.nextInt();

        Date dob = new Date(day, month, year);

        Person p = new Person(name, age, dob);
         
        p.displayPerson();
        
    }
}
