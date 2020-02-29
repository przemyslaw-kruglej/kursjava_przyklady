public class Osoba {
  private String imie;
  private String nazwisko;
  private int wiek;

  public Osoba(String imie, String nazwisko, int wiek)
      throws NieprawidlowaWartoscException, NieprawidlowyWiekException {
    if (imie == null) {
      throw new NieprawidlowaWartoscException(
          "Imie nie moze byc puste."
      );
    }

    if (nazwisko == null) {
      throw new NieprawidlowaWartoscException(
          "Nazwisko nie moze byc puste."
      );
    }

    if (wiek <= 0) {
      throw new NieprawidlowyWiekException();
    }

    this.imie = imie;
    this.nazwisko = nazwisko;
    this.wiek = wiek;
  }

  public static void main(String[] args) {
    try {
      Osoba o = new Osoba("Jan", "Nowak", -1);
    } catch (NieprawidlowaWartoscException e) {
      System.out.println("Nieprawidlowa wartosc: " + e.getMessage());
    } catch (NieprawidlowyWiekException e) {
      System.out.println("Nieprawidlowy wiek!");
    }

    try {
      Osoba o = new Osoba(null, "Nowak", 30);
    } catch (NieprawidlowaWartoscException e) {
      System.out.println("Nieprawidlowa wartosc: " + e.getMessage());
    } catch (NieprawidlowyWiekException e) {
      System.out.println("Nieprawidlowy wiek!");
    }

    try {
      Osoba o = new Osoba("Joanna", "Strzelczyk", -1);
    } catch (Exception e) {
      System.out.println("Wystapil blad! Komunikat bledu: " + e.getMessage());
    }

    try {
      Osoba o = new Osoba(null, "Strzelczyk", 30);
    } catch (Exception e) {
      System.out.println("Wystapil blad! Komunikat bledu: " + e.getMessage());
    }

    try {
      Osoba o = new Osoba("Adrian", "Sochacki", 30);
    } catch (NieprawidlowaWartoscException | NieprawidlowyWiekException e) {
      System.out.println("Nieprawidlowa wartosc: " + e.getMessage());
    }
  }
}
