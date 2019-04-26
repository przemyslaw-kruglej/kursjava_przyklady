public class StringLengthCharAt {
  public static void main(String[] args) {
    String komunikat = "Witaj Swiecie!";

    int liczbaZnakow = komunikat.length();
    System.out.println("Liczba znakow to: " + liczbaZnakow);

    // musimy odjac 1 od wyniku length(), poniewaz
    // indeks znakow zaczyna sie od 0, a nie 1!
    char ostatniZnak = komunikat.charAt(komunikat.length() - 1);
    System.out.println("Ostatni znak to: " + ostatniZnak);
  }
}
