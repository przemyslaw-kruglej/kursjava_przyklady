public class TworzenieIUzywanieTablic {
  public static void main(String[] args) {
    // tablica, ktora moze przechowywac maksymalnie 5 wartosci calkowitych
    int[] calkowite = new int[5];

    // tablica, ktora moze przechowywac maksymalnie 3 wartosci rzeczywiste
    //  wstepnie zainicjalizowane wartosciami 3.14, 5, -20.5
    double[] rzeczywiste = { 3.14, 5, -20.5 };

    // tablica, ktora bedzie mogla przechowywac ciagi znakow
    // na razie nie podalismy, ile wartosci typu String
    // ta tablica bedzie mogla przechowywac
    String[] slowa;

    // tworzymy tablice, ktora bedzie mogla miec maksymalnie
    // trzy elementy, i inicjalizujemy ja trzema elementami,
    // kolejno: Ala, ma, kota
    slowa = new String[] { "Ala", "ma", "kota" };

    // ustawiamy wartosc pierwszego, drugiego, i piatego elementu tablicy
    calkowite[0] = 10;  // pierwszy element ma indeks 0 (a nie 1)!
    calkowite[1] = 15;
    calkowite[4] = 200; // piaty element ma indeks 4 (a nie 5)!

    System.out.println(
        "Suma dwoch pierwszych elementow to " + (calkowite[0] + calkowite[1])
    );

    // zmieniamy wartosc pierwszego elementu
    rzeczywiste[0] = 100;
    System.out.println(
        "Pierwszy element tablicy rzeczywiste = " + rzeczywiste[0]
    );

    // zmieniamy pierwszy i trzeci (czyli ostatni) element
    slowa[0] = "Ania";
    slowa[2] = "psa";
    System.out.println(slowa[0] + " " + slowa[1] + " " + slowa[2]);
  }
}
