public class SprawdzRozmiarTablicy {
  public static void main(String[] args) {
    int[] calkowite = new int[5];
    double[] rzeczywiste = { 3.14, 5, -20.5 };

    System.out.println(
        "Liczba elementow w tablicy calkowite: " + calkowite.length
    );

    System.out.println(
        "Liczba elementow w tablicy rzeczywiste: " + rzeczywiste.length
    );
  }
}