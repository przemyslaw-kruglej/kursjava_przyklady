import java.util.Scanner;

public class SortowaniePobranychLiczb {
  public static void main(String[] args) {
    int[] liczby = new int[8];

    System.out.println("Podaj " + liczby.length + " liczb:");

    // pobieramy liczby
    for (int i = 0; i < liczby.length; i++) {
      System.out.print((i + 1) + " liczba: ");
      liczby[i] = getInt();
    }

    // zaczynamy od drugiego elementu tablicy
    // (ktorego indeks to 1, bo pierwszy element ma indeks 0)
    for (int i = 1; i < liczby.length; i++) {
      // liczba, dla ktorej aktualnie chcemy znalezc miejsce
      int aktualnaLiczba = liczby[i];

      // zaczynamy sprawdzanie elementow poprzednich
      // od elementu o indeksie o 1 mniejszym
      // niz ten, dla ktorego aktualnie szukamy miejsca
      int j = i - 1;

      // dopoki nie wyjdziemy poza zakres tablicy
      // lub poprzedni element jest wiekszy od tego,
      // dla ktorego aktualnie szukamy miejsca...
      while (j >= 0 && liczby[j] > aktualnaLiczba) {
        // ...przesuwamy poprzedni element o jedno miejsce w prawo
        liczby[j + 1] = liczby[j];
        j--;
      }

      // gdy petla sie konczy, j + 1 wyznacza indeks
      // dla wartosci, dla ktorej szukalismy miejsca
      liczby[j + 1] = aktualnaLiczba;
    }

    // na koncu petli jest posortowana
    System.out.println("Posortowane liczby:");

    for (int x : liczby) {
      System.out.print(x + ", ");
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}
