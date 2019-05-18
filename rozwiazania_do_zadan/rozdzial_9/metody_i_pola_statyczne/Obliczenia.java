public class Obliczenia {
  public static int silnia(int liczba) {
    int silnia = 1;

    for (int i = 1; i <= liczba; i++) {
      silnia = silnia * i;
    }

    return silnia;
  }

  public static int sumaLiczb(int[] tab) {
    int suma = 0;

    for (int i : tab) {
      suma += i;
    }

    return suma;
  }
}