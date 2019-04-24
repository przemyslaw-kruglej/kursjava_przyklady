import java.util.Scanner;

public class SilniaLiczbWTablicy {
  public static void main(String[] args) {
    int[] liczby = new int[5];

    System.out.println("Podaj " + liczby.length + " liczb:");

    // pobieramy liczby
    for (int i = 0; i < liczby.length; i++) {
      System.out.print((i + 1) + " liczba: ");
      liczby[i] = getInt();
    }

    // iterujemy po pobranych liczbach
    for (int x : liczby) {
      // silnie powinnismy liczyc tylko dla liczb nieujemnych
      if (x < 0) {
        System.out.println(
            "Silnie mozna policzyc tylko dla liczb >= 0. " +
            "Pomijam liczbe " + x
        );
      } else {
        int silnia = 1;

        // liczymy silnie aktualnej liczby
        for (int i = 1; i <= x; i++) {
          silnia *= i;
        }

        System.out.println("Silnia liczby " + x + " wynosi " + silnia);
      }
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}
