import java.util.Scanner;

public class Palindrom {
  public static void main(String[] args) {
    System.out.print("Podaj slowo: ");
    String slowo = getString();

    boolean czyPalindrom = true;
    int dlugoscSlowa = slowo.length();

    for (int i = 0; i < dlugoscSlowa / 2; i++) {
      if (slowo.charAt(i) != slowo.charAt(dlugoscSlowa - 1 - i)) {
        czyPalindrom = false;
        break;
      }
    }

    if (czyPalindrom) {
      System.out.println("Slowo " + slowo + " jest palindromem.");
    } else {
      System.out.println("Slowo " + slowo + " nie jest palindromem.");
    }
  }

  public static String getString() {
    return new Scanner(System.in).next();
  }
}
