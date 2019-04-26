public class TestowanieWartoscBezwzgledna {
  public static void main(String[] args) {
    wartoscBezwgledna_liczbaDodatnia_zwrociDodatniaWartosc();
    wartoscBezwgledna_liczbaUjemna_zwrociDodatniaWartosc();
  }

  public static int wartoscBezwgledna(int x) {
    return x < 0 ? -x : x;
  }

  public static void wartoscBezwgledna_liczbaDodatnia_zwrociDodatniaWartosc() {
    int rezultat = wartoscBezwgledna(20);

    if (rezultat != 20) {
      System.out.println(
          "Dla wartosci 20 otrzymano nieprawidlowa wartosc: " + rezultat
      );
    }
  }

  public static void wartoscBezwgledna_liczbaUjemna_zwrociDodatniaWartosc() {
    int rezultat = wartoscBezwgledna(-1);

    if (rezultat != 1) {
      System.out.println(
          "Dla wartosci -1 otrzymano nieprawidlowa wartosc: " + rezultat
      );
    }
  }
}
