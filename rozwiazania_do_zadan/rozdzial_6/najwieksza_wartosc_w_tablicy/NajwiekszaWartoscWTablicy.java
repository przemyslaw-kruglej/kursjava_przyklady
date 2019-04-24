public class NajwiekszaWartoscWTablicy {
  public static void main(String[] args) {
    int[] liczby = { 1, -20, 100, 40, -15 };

    // najwieksza liczbe inicjalizujemy wartoscia
    // pierwszego elementu tablicy
    int najwiekszaLiczba = liczby[0];

    // przechodzimy przez cala tablice, z pominieciem
    // pierwszego elementu - nie ma sensu porownywac go
    // do samego siebie - dlatego zmienna i zaczyna od 1,
    // czyli od indeksu drugiego elementu w tablicy
    for (int i = 1; i < liczby.length; i++) {
      // jezeli aktualnie sprawdzana wartosc z tablicy
      // jest wieksza, niz poprzednio zapamietana najwieksza
      // liczba, to zapisujemy ten aktualny element jako najwiekszy
      if (liczby[i] > najwiekszaLiczba) {
        najwiekszaLiczba = liczby[i];
      }
    }

    System.out.println("Najwieksza liczba to: " + najwiekszaLiczba);
  }
}
