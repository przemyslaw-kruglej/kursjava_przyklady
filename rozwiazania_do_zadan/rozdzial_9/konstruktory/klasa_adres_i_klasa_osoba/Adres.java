public class Adres {
  private String miejscowosc;
  private String kodPocztowy;
  private String nazwaUlicy;
  private int nrDomu;

  public Adres(String miejscowosc, String kodPocztowy,
               String nazwaUlicy, int nrDomu) {
    this.miejscowosc = miejscowosc;
    this.kodPocztowy = kodPocztowy;
    this.nazwaUlicy = nazwaUlicy;
    this.nrDomu = nrDomu;
  }

  public String toString() {
    return nazwaUlicy + " " + nrDomu + ", "  +
        kodPocztowy + " " + miejscowosc;
  }
}
