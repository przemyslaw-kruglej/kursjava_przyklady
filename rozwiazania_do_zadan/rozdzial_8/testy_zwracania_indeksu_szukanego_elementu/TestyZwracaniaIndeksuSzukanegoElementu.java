public class TestyZwracaniaIndeksuSzukanegoElementu {
  public static void main(String[] args) {
    indeksElementu_pustaTablica_zwrociMinusJeden();
    indeksElementu_elementNaPoczatku_zwrociIndeksZero();
    indeksElementu_elementNaKoncu_zwrociIndeksKoncowy();
    indeksElementu_elementuNieMa_zwrociMinusJeden();
    indeksElementu_elementWSrodku_zwrociIndeksElementu();
    indeksElementu_elementWieleRazy_zwrociIndeksPierwszego();
  }

  public static int indeksElementu(int[] tab, int szukanaLiczba) {
    for (int i = 0; i < tab.length; i++) {
      if (tab[i] == szukanaLiczba) {
        return i;
      }
    }
    // jezeli wartosci nie znaleziono, zwracamy -1
    return -1;
  }

  public static void indeksElementu_pustaTablica_zwrociMinusJeden() {
    // given
    int[] tablica = {};
    int szukanaLiczba = 5;

    // when
    int indeksLiczby = indeksElementu(tablica, szukanaLiczba);

    // then
    assertEquals(-1, indeksLiczby);
  }

  public static void indeksElementu_elementNaPoczatku_zwrociIndeksZero() {
    // given
    int[] tablica = { 5, 10, 15, 100, 200 };
    int szukanaLiczba = 5;

    // when
    int indeksLiczby = indeksElementu(tablica, szukanaLiczba);

    // then
    assertEquals(0, indeksLiczby);
  }

  public static void indeksElementu_elementNaKoncu_zwrociIndeksKoncowy() {
    // given
    int[] tablica = { 5, 10, 15, 100, 200 };
    int szukanaLiczba = 200;

    // when
    int indeksLiczby = indeksElementu(tablica, szukanaLiczba);

    // then
    assertEquals(tablica.length - 1, indeksLiczby);
  }

  public static void indeksElementu_elementuNieMa_zwrociMinusJeden() {
    // given
    int[] tablica = { 5, 10, 15, 100, 200 };
    int szukanaLiczba = 500;

    // when
    int indeksLiczby = indeksElementu(tablica, szukanaLiczba);

    // then
    assertEquals(-1, indeksLiczby);
  }

  public static void indeksElementu_elementWSrodku_zwrociIndeksElementu() {
    // given
    int[] tablica = { 5, 10, 15, 100, 200 };
    int szukanaLiczba = 15;

    // when
    int indeksLiczby = indeksElementu(tablica, szukanaLiczba);

    // then
    assertEquals(2, indeksLiczby);
  }

  public static void indeksElementu_elementWieleRazy_zwrociIndeksPierwszego() {
    // given
    int[] tablica = { 1, 2, 3, 2, 5 };
    int szukanaLiczba = 2;

    // when
    int indeksLiczby = indeksElementu(tablica, szukanaLiczba);

    // then
    assertEquals(1, indeksLiczby);
  }

  public static void assertEquals(int expected, int actual) {
    if (expected != actual) {
      System.out.println("Spodziewano sie liczby " + actual +
          ", ale otrzymano: " + expected);
    }
  }
}
