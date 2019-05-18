public class WykonywanieObliczen {
  public static void main(String[] args) {
    System.out.println("Silnia 6 to " + Obliczenia.silnia(6));

    int[] liczby = { 10, -50, 343, 42, 5 };
    System.out.println(
        "Suma liczb wynosi " + Obliczenia.sumaLiczb(liczby)
    );
  }
}