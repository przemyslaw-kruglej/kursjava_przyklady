package prostyprzyklad;

public class Pracownik extends Osoba {
  public int numerIdentyfikatora;

  public static void main(String[] args) {
    Osoba pewnaOsoba = new Osoba();
    pewnaOsoba.imie = "Jan";
    pewnaOsoba.nazwisko = "Kowalski";

    System.out.println(pewnaOsoba);

    Pracownik pewienPracownik = new Pracownik();
    pewienPracownik.imie = "Joanna";
    pewienPracownik.nazwisko = "Sikorska";
    pewienPracownik.numerIdentyfikatora = 1234;

    System.out.println(pewienPracownik);
  }
}