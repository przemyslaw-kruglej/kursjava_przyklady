import java.util.Scanner;

public class DzieleniePrzezZero {
  public static void main(String[] args) {
    double licznik, mianownik;

    // uzycie metody getInt omowionej w poprzednim rozdziale
    System.out.println("Podaj licznik:");
    licznik = getInt();

    System.out.println("Podaj mianownik:");
    mianownik = getInt();

    if (mianownik != 0) {
      double wynik = licznik / mianownik;
      System.out.println("Wynik dzielenia: " + wynik);
    } else {
      System.out.println("Mianownik nie moze byc = 0!");
    }
  }

  public static int getInt() {
      return new Scanner(System.in).nextInt();
  }
}
