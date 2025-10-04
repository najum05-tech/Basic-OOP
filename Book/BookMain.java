import java.util.Scanner;

class Book {
    int BookId;
    int Pages;
    private double Price;

void get()
{
    Scanner input=new Scanner(System.in);
    System.out.print("Enter Book Id= ");
    BookId= input.nextInt();
    System.out.print("Enter pages= ");
    Pages= input.nextInt();
    System.out.print("Enter price= ");
    Price= input.nextDouble();
}

void show()
{
    System.out.println("\nBook ID= " +BookId);
    System.out.println("Book page= " +Pages);
    System.out.println("Book Price= " +Price+ " Rs Only");
}

void set(double Price)
{
    this.Price =Price;
}

double getPrice()
{
    return this.Price;
}
 }
public class BookMain {
    public static void main(String[] args) {

        Book book= new Book();
        book.get();
        book.show();

        System.out.println('\n');
        book.set(999.99);
        System.out.println("\nAfter Modify= " +book.getPrice() + " Rs Only \n");
    }
}