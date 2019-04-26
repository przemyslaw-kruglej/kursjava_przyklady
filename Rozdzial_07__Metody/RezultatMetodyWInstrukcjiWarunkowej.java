import java.util.Scanner;

public class RezultatMetodyWInstrukcjiWarunkowej {
  public static void main(String[] args) {
    System.out.println("Podaj liczbe:");
    int podanaLiczba = getInt();

    // wywolujemy metode, a nastepnie sprawdzamy wynik
    //  przy pomocy instrukcji warunkowej if
    if (czyParzysta(podanaLiczba)) {
      System.out.println("Ta liczba jest parzysta.");
    } else {
      System.out.println("Ta liczba nie jest parzysta.");
    }

    System.out.println("Podaj kolejna liczbe:");

    if (getInt() >= 0) {
      System.out.println("Podales nieujemna liczbe.");
    } else {
      System.out.println("Podales liczbe ujemna.");
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }

  public static boolean czyParzysta(int liczba) {
    return liczba % 2 == 0;
  }
}
