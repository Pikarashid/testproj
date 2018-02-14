
import java.util.Scanner;

public class ScannerTest{
  public static void main(String arg[]){

    // scanner gets its input from the console.
    Scanner scanner = new Scanner(System.in);
    String name = "";

    // Get the user's name.
    System.out.print("Your name, adventurer? >");
    name = scanner.next();
    System.out.println();

    // Print their name in a a message.
    System.out.println("Welcome, " + name + " to  Javaland!");
  }
}
