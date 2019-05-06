import java.util.Arrays;

public class PrzykladUzyciaArraysEquals {
  public static void main(String[] args) {
    int[] tablica1 = { 1, 2, 3 };
    int[] tablica2 = { 1, 2, 3 };
    int[] tablica3 = { 4, 5 };

    if (Arrays.equals(tablica1, tablica2)) {
      System.out.println("tablica1 == tablica2");
    } else {
      System.out.println("tablica1 != tablica2");
    }

    if (Arrays.equals(tablica1, tablica3)) {
      System.out.println("tablica1 == tablica3");
    } else {
      System.out.println("tablica1 != tablica3");
    }
  }
}
