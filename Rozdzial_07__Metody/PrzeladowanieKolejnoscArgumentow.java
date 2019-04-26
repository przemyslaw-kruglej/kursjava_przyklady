public class PrzeladowanieKolejnoscArgumentow {
  public static void main(String[] args) {
    wypisz("Liczba wynosi: ", 8);
    wypisz(32, "2 do potegi 5 wynosi");
  }

  public static void wypisz(String komunikat, int liczba) {
    System.out.println(komunikat + liczba);
  }

  public static void wypisz(int liczba, String komunikat) {
    System.out.println(komunikat);
    System.out.println(liczba);
  }
}
