public class Uczen {
  public String nazwisko;
  public int[] oceny;
  public int rokUrodzenia;

  public double policzSredniaOcen() {
    if (oceny == null) {
      return 0;
    }

    double sumaOcen = 0;

    for (int i = 0; i < oceny.length; i++) {
      sumaOcen += oceny[i];
    }

    return sumaOcen / oceny.length;
  }
}
