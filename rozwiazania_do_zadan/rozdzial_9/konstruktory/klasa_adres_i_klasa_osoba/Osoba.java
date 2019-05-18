public class Osoba {
  private String imie;
  private String nazwisko;
  private final int rokUrodzenia;
  private Adres adres;

  public Osoba(String imie, String nazwisko,
               int rokUrodzenia, Adres adres) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.rokUrodzenia = rokUrodzenia;
    this.adres = adres;
  }

  public Osoba(String imie, String nazwisko, int rokUrodzenia,
               String miejscowosc, String kodPocztowy,
               String nazwaUlicy, int nrDomu) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.rokUrodzenia = rokUrodzenia;

    this.adres = new Adres(
        miejscowosc, kodPocztowy, nazwaUlicy, nrDomu
    );
  }

  public String toString() {
    return "Osoba " + imie + " " + nazwisko +
        " urudzona w roku " + rokUrodzenia +
        " mieszka pod adresem " + adres;
  }

  public static void main(String[] args) {
    Adres adres = new Adres("Warszawa", "01-123", "Krucza", 8);
    Osoba osoba1 = new Osoba("Jan", "Kowalski", 1982, adres);

    Osoba osoba2 = new Osoba(
        "Jan", "Nowak", 1980,
        "Warszawa", "01-231", "Grzybowska", 20
        );

    System.out.println(osoba1);
    System.out.println(osoba2);
  }
}