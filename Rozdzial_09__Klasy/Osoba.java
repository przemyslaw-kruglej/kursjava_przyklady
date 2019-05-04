public class Osoba {
  private String imie;
  private String nazwisko;
  private int wiek;

  public Osoba(String imie, String nazwisko, int wiek) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.wiek = wiek;
  }

  public boolean equals(Object o) {
    // sprawdz, czy przeslany obiekt jest tym samym obiektem,
    // na rzecz ktorego zostala wywolana metoda equals
    if (this == o) {
      return true;
    }

    // sprawdz, czy nie przeslano nulla lub obiektu innej,
    // niekompatybilnej klasy (np. String)
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }

    // powyzsza instrukcja if zapewnia, ze ponizsza instrukcja
    // zakonczy sie sukcesem - rzutujemy referencje do obiektu typu Object,
    // (przeslana jako argument), do obiektu typu Osoba, aby uzyskac
    // dostep do pol imie, nazwisko, oraz wiek
    Osoba innaOsoba = (Osoba) o;

    // porownujemy kolejne pola do siebie - musimy uwzglednic,
    // ze pola typow zlozonych moga byc nullowe
    // jezeli pola aktualnego i porownywanego obiektu sa nullowe,
    // to uznajemy je za rowne
    if ((this.imie == null && innaOsoba.imie != null) ||
        (this.imie != null && !this.imie.equals(innaOsoba.imie))) {
      return false;
    }

    if ((this.nazwisko == null && innaOsoba.nazwisko != null) ||
        (this.nazwisko != null && !this.nazwisko.equals(innaOsoba.nazwisko))) {
      return false;
    }

    return this.wiek == innaOsoba.wiek;
  }
}
