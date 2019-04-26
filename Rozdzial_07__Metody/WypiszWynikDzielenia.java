public class WypiszWynikDzielenia {
  public static void main(String[] args) {
    wypiszWynikDzielenia(10, 0);
    wypiszWynikDzielenia(25, 5);
  }

  public static void wypiszWynikDzielenia(int x, int y) {
    if (y == 0) {
      System.out.println("Nie mozna dzielic przez 0!");
      return;
    }

    System.out.println("Wynik dzielenia: " + (x / y));
  }
}
