import java.util.Scanner;

public class OdwrotnaKolejnoscPobraneSlowa {
  public static void main(String[] args) {
    String slowo1, slowo2, slowo3;

    System.out.println("Podaj pierwsze slowo:");
    slowo1 = getString();

    System.out.println("Podaj drugie slowo:");
    slowo2 = getString();

    System.out.println("Podaj trzecie slowo:");
    slowo3 = getString();

    System.out.println(slowo3 + ", " + slowo2 + ", " + slowo1);
  }

  public static String getString() {
    return new Scanner(System.in).next();
  }
}