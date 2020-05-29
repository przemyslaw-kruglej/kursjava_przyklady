package prostyprzyklad;

public class Pracownik extends Osoba {
  public int numerIdentyfikatora;

  public String toString() {
    return "Pracownik " + imie + " " + nazwisko +
        ", identyfikator: " + numerIdentyfikatora;
  }

  public static void main(String[] args) {
    Osoba pewnaOsoba = new Osoba();
    pewnaOsoba.imie = "Jan";
    pewnaOsoba.nazwisko = "Kowalski";

    System.out.println(pewnaOsoba.toString());

    Pracownik pewienPracownik = new Pracownik();
    pewienPracownik.imie = "Joanna";
    pewienPracownik.nazwisko = "Sikorska";
    pewienPracownik.numerIdentyfikatora = 1234;

    System.out.println(pewienPracownik.toString());

    Osoba innaOsoba = new Pracownik();
    innaOsoba.imie = "Adrian";
    innaOsoba.nazwisko = "Sochacki";

    System.out.println(innaOsoba.toString());
  }
}
