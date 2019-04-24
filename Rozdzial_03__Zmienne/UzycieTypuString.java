public class UzycieTypuString {
  public static void main(String[] args) {
    String imie = "Jan";
    String nazwisko = "Nowak";

    String osoba = imie + " " + nazwisko;
    int wiek = 25;

    String komunikat = osoba + " ma " + wiek + " lat.";

    System.out.println(komunikat);

    // korzystamy z metody toUpperCase, ktora zwraca
    //  string z malymi literami zamienionymi na wielkie
    System.out.println(komunikat.toUpperCase());
  }
}