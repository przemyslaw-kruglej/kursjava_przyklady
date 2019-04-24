public class CzyLiczbaJestWTablicy {
  public static void main(String[] args) {
    boolean znaleziona = false;
    int[] liczby = { -20, 105, 0, 26, -99, 7, 1026 };

    int szukanaLiczba = 7;

    for (int i = 0; i < liczby.length; i++) {
      if (liczby[i] == szukanaLiczba) {
        znaleziona = true;
        break; // znalezlismy liczbe - mozemy wiec przerwac petle
      }
    }

    if (znaleziona) {
      System.out.println("Liczba zostala znaleziona!");
    } else {
      System.out.println("Liczba nie zostala znaleziona.");
    }
  }
}