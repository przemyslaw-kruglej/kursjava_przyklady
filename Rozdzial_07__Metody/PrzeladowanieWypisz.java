public class PrzeladowanieWypisz {
  public static void main(String[] args) {
    wypisz(10);
    wypisz(3.14);
    wypisz(7, 128);
    wypisz("Witaj!");
    wypisz(new int[] {2, 40, 500});
  }

  public static void wypisz(int liczba) {
    System.out.println("Liczba calkowita: " + liczba);
  }

  public static void wypisz(int pierwsza, int druga) {
    System.out.println("Pierwsza liczba: " + pierwsza +
        ", druga liczba: " + druga);
  }

  public static void wypisz(double liczba) {
    System.out.println("Liczba rzeczywista: " + liczba);
  }

  public static void wypisz(String tekst) {
    System.out.println("Tekst: " + tekst);
  }

  public static void wypisz(int[] tablica) {
    for (int i = 0; i < tablica.length; i++) {
      System.out.println("Element tablica nr " + i +
          " to: " + tablica[i]);
    }
  }
}
