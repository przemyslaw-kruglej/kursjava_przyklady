public class PorownajTabliceStringow {
  public static void main(String[] args) {
    String[] pierwsza = { "Ala", "ma", "kota" };
    String[] druga = { "Ala", "ma", "kota" };

    boolean roznicaZnaleziona = false;

    if (pierwsza.length != druga.length) {
      roznicaZnaleziona = true;
    } else {
      for (int i = 0; i < pierwsza.length; i++) {
        if (!pierwsza[i].equals(druga[i])) {
          roznicaZnaleziona = true;
          break;
        }
      }
    }

    if (roznicaZnaleziona) {
      System.out.println("Tablice nie sa takie same.");
    } else {
      System.out.println("Tablice sa takie same");
    }
  }
}