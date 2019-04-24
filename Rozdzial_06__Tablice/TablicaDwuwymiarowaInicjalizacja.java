public class TablicaDwuwymiarowaInicjalizacja {
  public static void main(String[] args) {
    char[][] kwadrat = {
        { 'X', 'X', 'X', 'X' },
        { 'X', 'O', 'O', 'X' },
        { 'X', 'O', 'O', 'X' },
        { 'X', 'X', 'X', 'X' }
    };

    for (int rzad = 0; rzad < kwadrat.length; rzad++) {
      for (int kolumna = 0; kolumna < kwadrat[rzad].length; kolumna++) {
        System.out.print(kwadrat[rzad][kolumna]);
      }

      System.out.println(); // nowa linia
    }
  }
}