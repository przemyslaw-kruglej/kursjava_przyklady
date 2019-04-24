public class PrzykladOperatoraMnozenia {
  public static void main(String[] args) {
    final int SEKUNDY_W_MINUCIE = 60;
    final int MINUTY_W_GODZINIE = 60;

    final int SEKUNDY_W_GODZINIE = SEKUNDY_W_MINUCIE * MINUTY_W_GODZINIE;

    System.out.println("Liczba sekund w godzinie: " + SEKUNDY_W_GODZINIE);
  }
}