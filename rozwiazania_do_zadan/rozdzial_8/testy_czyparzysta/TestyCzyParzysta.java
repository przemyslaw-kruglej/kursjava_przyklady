public class TestyCzyParzysta {
  public static void main(String[] args) {
    czyParzysta_liczbaParzystaDodatnia_zwrociParzysta();
    czyParzysta_liczbaParzystaUjemna_zwrociParzysta();
    czyParzysta_liczbaNieparzystaDodatnia_zwrociNieparzysta();
    czyParzysta_liczbaNieparzystaUjemna_zwrociNieparzysta();
    czyParzysta_liczbaZero_zwrociParzysta();
  }

  public static boolean czyParzysta(int liczba) {
    return liczba % 2 == 0;
  }

  public static void czyParzysta_liczbaParzystaDodatnia_zwrociParzysta() {
    assertEquals(true, czyParzysta(10));
  }

  public static void czyParzysta_liczbaParzystaUjemna_zwrociParzysta() {
    assertEquals(true, czyParzysta(-2));
  }

  public static void czyParzysta_liczbaNieparzystaDodatnia_zwrociNieparzysta() {
    assertEquals(false, czyParzysta(999));
  }

  public static void czyParzysta_liczbaNieparzystaUjemna_zwrociNieparzysta() {
    assertEquals(false, czyParzysta(-9));
  }

  public static void czyParzysta_liczbaZero_zwrociParzysta() {
    assertEquals(true, czyParzysta(0));
  }

  public static void assertEquals(boolean expected, boolean actual) {
    if (expected != actual) {
      System.out.println("Spodziewano sie  " + actual +
          ", ale otrzymano: " + expected);
    }
  }
}
