public class ZwrocWynikDzielenia {
  public static void main(String[] args) {
    System.out.println(podziel(10, 0)); // spowoduje rzucenie wyjatku dzielenia przez 0
    System.out.println(podziel(25, 5));
  }

  public static int podziel(int x, int y) {
    return x / y;
  }
}
