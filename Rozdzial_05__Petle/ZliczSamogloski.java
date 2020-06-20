import java.util.Scanner;

public class ZliczSamogloski {
  public static void main(String[] args) {
    System.out.println("Podaj slowo:");
    String slowo = getString();

    int liczbaSamoglosek = 0;

    for (int i = 0; i < slowo.length(); i++) {
      char znak = slowo.charAt(i);

      if (znak == 'a' || znak == 'e' || znak == 'i' ||
          znak == 'u' || znak == 'y' || znak == 'o') {
        liczbaSamoglosek++;
      }
    }

    System.out.println(
        "Slowo " + slowo + " ma " + liczbaSamoglosek + " samoglosek."
    );
  }

  public static String getString() {
    return new Scanner(System.in).next();
  }
}
