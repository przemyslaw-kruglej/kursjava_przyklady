public class Stale {
  public static void main(String[] args) {
    final double PI = 3.14;
    final int LICZBA_DNI_W_TYGODNIU = 7;

    int promien = 20;
    double poleKola = PI * promien * promien;

    // blad!
    // kod jest zakomentowany, bo nie mozna zmienic wartosci stalej
    // PI = 5;
  }
}