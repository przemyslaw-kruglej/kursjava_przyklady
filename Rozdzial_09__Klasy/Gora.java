public class Gora {
  public int wysokosc;
  public String nazwa;

  public double policzWysokoscWKm() {
    return wysokosc / 1000.0;
  }

  public static void main(String[] args) {
    Gora pewnaGora = new Gora();

    System.out.println("Wysokosc gory: " + pewnaGora.wysokosc);
    System.out.println("Nazwa gory: " + pewnaGora.nazwa);

    // zakomentowane, bo powoduje blad NullPointerException!
    //System.out.println("Nazwa gory wielkimi literami: " +
    //    gora.nazwa.toUpperCase());

    pewnaGora = null;

    if (pewnaGora != null) {
      System.out.println("Wysokosc gory w kilometrach: " +
          pewnaGora.policzWysokoscWKm());
    } else {
      System.out.println("Obiekt pewnaGora to null!");
    }
  }
}
