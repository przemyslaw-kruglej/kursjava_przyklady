package produkty;

public class Produkt {
  private String nazwa;
  private double cena;

  public Produkt(String nazwa) {
    this(nazwa, 999999);
  }

  public Produkt(String nazwa, double cena) {
    this.nazwa = nazwa;
    this.cena = cena;
  }
}
