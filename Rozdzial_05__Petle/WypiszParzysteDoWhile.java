public class WypiszParzysteDoWhile {
  public static void main(String[] args) {
    int x = 0;

    do {
      System.out.print(x + " ");
      x += 2;
    } while (x <= 20);

    System.out.println(); // wypisz pusta linie
    System.out.println("x na koncu jest rowne " + x);
  }
}
