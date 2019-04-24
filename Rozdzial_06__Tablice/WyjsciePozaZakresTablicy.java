public class WyjsciePozaZakresTablicy {
  public static void main(String[] args) {
    int[] tablica = { 1, 2, 3 };

    // element o indeksie 3 nie istnieje!
    // ostatni (trzeci) element tablicy ma indeks 2
    // kod sie skompiluje, ale w trakcie dzialania programu pojawi sie blad
    System.out.println(tablica[3]);
  }
}
