public class Produkt {
  private double cena;
  private String nazwa;

  public Produkt() {

  }

  public Produkt(double cena, String nazwa) {
    this.cena = cena;
    this.nazwa = nazwa;
  }

  public void setCena(double cena) {
    this.cena = cena;
  }

  public double getCena() {
    return cena;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public String getNazwa() {
    return nazwa;
  }

  public String toString() {
    return "Produkt o nazwie " + nazwa + " kosztuje " + cena;
  }
}
