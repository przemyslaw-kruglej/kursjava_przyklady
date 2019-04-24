public class WypiszElementyTablicy {
  public static void main(String[] args) {
    int[] liczby = { -5, 100, 1, 0, 20 };

    for (int i = 0; i < liczby.length; i++) {
      System.out.print(liczby[i] + " ");
    }

    // przejdz do nowej linii
    System.out.println();

    for (int i = liczby.length - 1; i >= 0 ; i--) {
      System.out.print(liczby[i] + " ");
    }
  }
}