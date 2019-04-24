public class WypiszZnakCharAtNieprawidlowyIndeks {
  public static void main(String[] args) {
    String komunikat = "Witaj!";

    // blad! wykonanie programu zakonczy sie bledem,
    // poniewaz indeks 100 jest nieprawidlowy - zmienna komunikat
    // nie zawiera az tylu znakow
    System.out.println(komunikat.charAt(100));
  }
}
