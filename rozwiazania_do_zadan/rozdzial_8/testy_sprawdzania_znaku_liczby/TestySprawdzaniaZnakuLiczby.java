public class TestySprawdzaniaZnakuLiczby {
  public static void main(String[] args) {
    sign_pierwszaUjemna_zwrociMinusJeden();
    sign_zero_zwrociZero();
    sign_pierwszaDodatnia_zwrociJeden();
    sign_liczbaUjemna_zwrociMinusJeden();
    sign_liczbaDodatnia_zwrociJeden();
  }

  public static int sign(int liczba) {
    return liczba == 0 ? 0 : (liczba < 0 ? -1 : 1);
  }

  public static void sign_pierwszaUjemna_zwrociMinusJeden() {
    assertEquals(-1, sign(-1));
  }

  public static void sign_zero_zwrociZero() {
    assertEquals(0, sign(0));
  }

  public static void sign_pierwszaDodatnia_zwrociJeden() {
    assertEquals(1, sign(1));
  }

  public static void sign_liczbaUjemna_zwrociMinusJeden() {
    assertEquals(-1, sign(-20));
  }

  public static void sign_liczbaDodatnia_zwrociJeden() {
    assertEquals(1, sign(100));
  }

  public static void assertEquals(int expected, int actual) {
    if (expected != actual) {
      System.out.println("Spodziewano sie liczby " + actual +
          ", ale otrzymano: " + expected);
    }
  }
}
