public class CoDrugaWartoscTablicy {
  public static void main(String[] args) {
    // parzysta liczba elementow
    int[] parzysta = { 1, 10, 15, 0, 100, 20 };

    // nieparzysta liczba elementow
    int[] nieparzysta = { 5, 7, 9 };

    for (int i = 0; i < parzysta.length; i += 2) {
      System.out.print(parzysta[i] + ", ");
    }

    System.out.println(); // nowa linia

    for (int i = 0; i < nieparzysta.length; i += 2) {
      System.out.print(nieparzysta[i] + ", ");
    }
  }
}
