public class TestowanieDoKwadratu2 {
  public static void main(String[] args) {
    doKwadratu_wartoscDodatnia_wartoscPodniesionaDoKwadratu();
    doKwadratu_wartoscDodatnia_wartoscPodniesionaDoKwadratu2();
    doKwadratu_wartoscUjemna_wartoscPodniesionaDoKwadratu();
    doKwadratu_liczbaZero_zero();
  }

  public static int doKwadratu(int x) {
    return x * x;
  }

  public static void doKwadratu_wartoscDodatnia_wartoscPodniesionaDoKwadratu() {
    int wynik = doKwadratu(20);
    assertEquals(400, wynik);
  }

  public static void doKwadratu_wartoscDodatnia_wartoscPodniesionaDoKwadratu2() {
    // given
    int liczba = 20;

    // when
    int wynik = doKwadratu(liczba);

    // then
    assertEquals(400, wynik);
  }

  public static void doKwadratu_wartoscUjemna_wartoscPodniesionaDoKwadratu() {
    int wynik = doKwadratu(-5);
    assertEquals(25, wynik);
  }

  public static void doKwadratu_liczbaZero_zero() {
    int wynik = doKwadratu(0);
    assertEquals(0, wynik);
  }

  public static void assertEquals(int expected, int actual) {
    if (expected != actual) {
      System.out.println("Spodziewano sie liczby " + actual +
          ", ale otrzymano: " + expected);
    }
  }
}
