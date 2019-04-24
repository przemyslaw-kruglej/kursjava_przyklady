public class PorownajTablice {
  public static void main(String[] args) {
    int[] pierwszaTablica = { 10, 5, 20 };
    int[] drugaTablica = { 10, 5, 20 };

    // jezeli tablice maja rozne rozmiary,
    // to na pewno nie bede takie same
    if (pierwszaTablica.length != drugaTablica.length) {
      System.out.println("Tablice nie sa takie same.");
    } else {
      boolean czyRoznicaZnaleziona = false;

      for (int i = 0; i < pierwszaTablica.length; i++) {
        // sprawdzamy, czy elementy o tych samych indeksach roznia
        // sie wartoscia - jezeli znajdziemy choc jedna roznice,
        // to bedziemy wiedziec, iz tablice nie sa takie same
        if (pierwszaTablica[i] != drugaTablica[i]) {
          czyRoznicaZnaleziona = true;
          break;
        }
      }

      if (czyRoznicaZnaleziona) {
        System.out.println("Tablice nie sa takie same.");
      } else {
        System.out.println("Tablice sa takie same.");
      }
    }
  }
}
