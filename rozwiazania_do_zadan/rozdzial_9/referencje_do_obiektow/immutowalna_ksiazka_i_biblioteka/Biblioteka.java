public class Biblioteka {
  private final Ksiazka[] ksiazki;

  public Biblioteka(Ksiazka[] ksiazki) {
    this.ksiazki = new Ksiazka[ksiazki.length];

    for (int i = 0; i < ksiazki.length; i++) {
      this.ksiazki[i] = ksiazki[i];
    }
  }

  public Ksiazka[] getKsiazki() {
    Ksiazka[] rezultat = new Ksiazka[ksiazki.length];

    for (int i = 0; i < ksiazki.length; i++) {
      rezultat[i] = ksiazki[i];
    }

    return rezultat;
  }

  public static void main(String[] args) {
    Ksiazka[] mrocznaWieza = {
        new Ksiazka("Roland", "Stephen King", 39.99),
        new Ksiazka("Powolanie trojki", "Stephen King", 39.99),
        new Ksiazka("Ziemie jalowe", "Stephen King", 39.99),
        new Ksiazka("Czarnoksieznik i krysztal", "Stephen King", 45.99),
        new Ksiazka("Wilki z Calla", "Stephen King", 39.99),
        new Ksiazka("Piesn Susannah", "Stephen King", 29.99),
        new Ksiazka("Mroczna Wieza", "Stephen King", 49.99),
    };

    Biblioteka biblioteka = new Biblioteka(mrocznaWieza);

    System.out.println("Ksiazki w bibliotece:");

    for (Ksiazka ksiazka : biblioteka.getKsiazki()) {
      System.out.println(ksiazka);
    }
  }
}