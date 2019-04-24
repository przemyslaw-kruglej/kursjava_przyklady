import java.util.Scanner;

public class SprawdzImie {
  public static void main(String[] args) {
    String imie;

    System.out.println("Podaj swoje imie:");
    imie = getString();

    if (imie.equals("Przemek")) {
      System.out.println("Mamy takie samie imiona.");
    } else {
      System.out.println("Mamy rozne imiona.");
    }
  }

  public static String getString() {
    return new Scanner(System.in).next();
  }
}