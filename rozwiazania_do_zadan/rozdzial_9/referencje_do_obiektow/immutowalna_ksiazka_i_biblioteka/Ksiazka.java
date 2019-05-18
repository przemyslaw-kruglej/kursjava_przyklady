public class Ksiazka {
  private final String tytul;
  private final String autor;
  private final double cena;

  public Ksiazka(String tytul, String autor, double cena) {
    this.tytul = tytul;
    this.autor = autor;
    this.cena = cena;
  }

  public String toString() {
    return "Ksiazka " + tytul + ", autorstwa " + autor +
        " kosztuje " + cena;
  }
}