public class Ksiegarnia {
  public static void main(String[] args) {
    Ksiazka lokomotywa = new Ksiazka();

    lokomotywa.tytul = "Lokomotywa";
    lokomotywa.autor = "Julian Tuwim";
    lokomotywa.ustawCene(29.99);

    System.out.println(lokomotywa);

    // zakomenotwane, poniewaz te linie powoduja blad kompilacji
    //  nie mozna odnosic sie do prywatnych pol i metod klasy
    //  spoza tej klasy
    // lokomotywa.cena = -10;
    // lokomotywa.czyCenaJestPoprawna(0);

    Ksiazka ptasieRadio = new Ksiazka();

    ptasieRadio.tytul = "Ptasie Radio";
    ptasieRadio.autor = "Julian Tuwim";
    ptasieRadio.ustawCene(19.99);

    if (lokomotywa.czyTakaSamaCena(ptasieRadio)) {
      System.out.println("Ksiazki kosztuja tyle samo.");
    } else {
      System.out.println("Cena ksiazek nie jest taka sama.");
    }
  }
}
