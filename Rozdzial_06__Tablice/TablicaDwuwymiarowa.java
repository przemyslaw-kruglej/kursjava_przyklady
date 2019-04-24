public class TablicaDwuwymiarowa {
  public static void main(String[] args) {
    int[][] tablica2d = new int[3][5];

    // pierwszy element pierwszej pod-tablicy
    tablica2d[0][0] = 5;

    // drugi, trzeci, i czwarty element drugiej pod-tablicy
    tablica2d[1][1] = 10;
    tablica2d[1][2] = 100;
    tablica2d[1][3] = 1000;

    // drugi element trzeciej pod-tablicy
    tablica2d[2][1] = 50;

    System.out.println(tablica2d[0][0]);
    System.out.println(tablica2d[0][4]);
    System.out.println(tablica2d[1][3]);
    System.out.println(tablica2d[2][3]);

    System.out.println("Pierwszy wymiar: " + tablica2d.length);
    System.out.println("Drugi wymiar: " + tablica2d[0].length);

    for (int i = 0; i < tablica2d.length; i++) {
      for (int j = 0; j < tablica2d[i].length; j++) {
        System.out.print(tablica2d[i][j] + ", ");
      }

      System.out.println(); // nowa linia
    }
  }
}
