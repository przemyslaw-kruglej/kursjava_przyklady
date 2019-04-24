public class DomyslneWartosciWTablicach {
  public static void main(String[] args) {
    int[] calkowite = new int[5];

    calkowite[0] = 10;
    calkowite[1] = 15;

    // trzeci element nie byl ustawiony - bedzie mial
    //  domyslna wartosc typu int, czyli 0
    System.out.println("Trzeci element: " + calkowite[2]);
  }
}
