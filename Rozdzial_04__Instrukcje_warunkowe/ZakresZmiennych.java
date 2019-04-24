public class ZakresZmiennych {
  public static void main(String[] args) {
    int liczba = 1;

    if (liczba > 0) {
      int drugaLiczba = 10;
      // tutaj mamy dostep do zmiennych:
      //  liczba, drugaLiczba

      if (drugaLiczba > 5) {
        int trzeciaLiczba = 25;
        // tutaj mamy dostep do zmiennych:
        //  liczba, drugaLiczba, trzeciaLiczba
      }

      // tutaj mamy dostep do zmiennych:
      //  liczba, drugaLiczba
    } else {
      // tutaj mamy dostep do zmiennych:
      //  liczba
    }

    // tutaj mamy dostep do zmiennej:
    //  liczba
  }
}