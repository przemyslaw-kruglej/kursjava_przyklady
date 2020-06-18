package produkty;

public class Czeresnie extends Produkt {
  private String gatunek;

  public Czeresnie() {
    this("nieznany gatunek");
  }

  public Czeresnie(String gatunek) {
    super("Czeresnie");
    this.gatunek = gatunek;
  }

  public Czeresnie(String gatunek, double cena) {
    super("Czeresnie", cena);
    this.gatunek = gatunek;
  }
}