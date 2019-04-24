import java.util.Scanner;

public class PobieranieDanychOdUzytkownika {
  public static void main(String[] args) {
    // informujemy uzytkownika, co ma zrobic
    System.out.println("Prosze podac imie:");

    // wczytujemy od uzytkownika pojedyncze slowo do zmiennej imie
    String imie = getString();

    // wypisujemy komunikat, uzywajac wczytane od uzytkownika imie
    System.out.println("Witaj, " + imie + "!");

    // kolejny przyklad – tym razem prosimy i wczytujemy liczbe calkowita
    System.out.println("Prosze podac promien kola:");

    int r = getInt();

    double poleKola = 3.14 * r * r;
    System.out.println("Pole kola o promieniu " + r + " wynosi: " + poleKola);
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }

  public static String getString() {
    return new Scanner(System.in).next();
  }
}