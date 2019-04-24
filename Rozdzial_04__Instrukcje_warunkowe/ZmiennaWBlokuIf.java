public class ZmiennaWBlokuIf {
  public static void main(String[] args) {
    int licznik = 9;
    int mianownik = 3;

    if (mianownik != 0) {
      double wynik = licznik / mianownik;
    }

    // blad! kod sie nie skompiluje - zmienna wynik
    // w tym miejscu juz nie istnieje!
    System.out.println("Wynik = " + wynik);
  }
}