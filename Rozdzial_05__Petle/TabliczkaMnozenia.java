public class TabliczkaMnozenia {
  public static void main(String[] args) {
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        int wynik = i * j;

        if (wynik >= 10) {
          System.out.print(wynik + " ");
        } else {
          // dla jednocyfrowych wynikow dodajemy spacje
          // na poczatku, by wynik byl ladnie sformatowany
          System.out.print(" " + wynik + " ");
        }
      }

      System.out.println(); // pusta linia
    }
  }
}