public class WyjatekZamiastReturn {
  public static void main(String[] args) {
    try {
      System.out.println(podziel(10, 0));
    } catch (IllegalArgumentException e) {
      System.out.println("Wystpil wyjatek " + e.getMessage());
    }
  }

  public static int podziel(int x, int y) {
    if (y == 0) {
      throw new IllegalArgumentException("Dzielnik nie moze byc rowny 0.");
    }

    return x / y;
  }
}
