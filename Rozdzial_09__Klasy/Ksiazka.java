public class Ksiazka {
  public String tytul;
  public String autor;

  private double cena;

  public void ustawCene(double nowaCena) {
    if (czyCenaJestPoprawna(nowaCena)) {
      cena = nowaCena;
    } else {
      System.out.println("Cena " + nowaCena + " jest nieprawidlowa!");
    }
  }

  public boolean czyTakaSamaCena(Ksiazka innaKsiazka) {
    return cena == innaKsiazka.cena;
  }

  public String toString() {
    return "Ksiazka o tytule " + tytul +
        ", ktorej autorem jest " + autor + ", kosztuje " + cena;
  }

  private boolean czyCenaJestPoprawna(double cenaDoSprawdzenia) {
    return cenaDoSprawdzenia > 0;
  }
}
