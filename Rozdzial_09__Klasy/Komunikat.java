public class Komunikat {
  private final String komunikat;

  private static int liczbaObiektowTejKlasy;

  public Komunikat(String komunikat) {
    this.komunikat = komunikat;
    liczbaObiektowTejKlasy++;
  }

  public static int ileObiektowUtworzono() {
    return liczbaObiektowTejKlasy;
  }

  public static void main(String[] args) {
    System.out.println("Liczba obiektow klasy Komunikat: " +
        Komunikat.ileObiektowUtworzono()
    );

    Komunikat k1 = new Komunikat("Witaj");
    Komunikat k2 = new Komunikat("Witam!");
    Komunikat k3 = new Komunikat("Halo?");

    System.out.println("Liczba obiektow klasy Komunikat: " +
        Komunikat.ileObiektowUtworzono()
    );
  }
}
