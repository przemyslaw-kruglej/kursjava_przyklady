package prostyprzyklad;

public class Budynek {
  public static void main(String[] args) {
    Osoba osoba = new Osoba();
    osoba.imie = "Jan";
    osoba.nazwisko = "Kowalski";

    Pracownik pracownik = new Pracownik();
    pracownik.imie = "Joanna";
    pracownik.nazwisko = "Sikorska";
    pracownik.numerIdentyfikatora = 1234;

    wejdzDoBudynku(osoba);
    wejdzDoBudynku(pracownik);

    Osoba innaOsoba = new Pracownik();
    innaOsoba.imie = "Artur";
    innaOsoba.nazwisko = "Strzelecki";
    // blad! wymagane rzutowanie
    //innaOsoba.numerIdentyfikatora = 4321;
    ((Pracownik) innaOsoba).numerIdentyfikatora = 4321;

    Osoba kolejnaOsoba = new Osoba();
    // kompilacja ok, ale blad wykonania!
    ((Pracownik) kolejnaOsoba).numerIdentyfikatora = 5555;
  }

  public static void wejdzDoBudynku(Osoba osoba) {
    System.out.println("W budynku jest " + osoba);
  }
}
