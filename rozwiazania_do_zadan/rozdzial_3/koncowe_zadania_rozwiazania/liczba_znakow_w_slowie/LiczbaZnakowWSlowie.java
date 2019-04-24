import java.util.Scanner;

public class LiczbaZnakowWSlowie {
  public static void main(String[] args) {
    String slowo;

    System.out.println("Podaj slowo:");
    slowo = getString();

    System.out.println("To slowo ma " + slowo.length() + " znakow.");
  }

  public static String getString() {
    return new Scanner(System.in).next();
  }
}