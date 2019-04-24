public class NowaTablicaZWiekszaLiczbaElementow {
  public static void main(String[] args) {
    int[] liczby = { 10, 100, -5 };

    System.out.println("Elementy tablicy liczby:");

    for (int x : liczby) {
      System.out.print(x + ", ");
    }

    System.out.println(); // przejdz do nowej linii

    // tworzymy druga tablice o wiekszym rozmiarze
    int[] tymczasowaTabela = new int[5];

    // przepisujemy elementy z pierwszej tablicy
    for (int i = 0; i < liczby.length; i++) {
      tymczasowaTabela[i] = liczby[i];
    }

    // ustawiamy dodatkowe elementy
    tymczasowaTabela[3] = 20;
    tymczasowaTabela[4] = 1;

    // przypisujemy druga tablice do pierwszej
    liczby = tymczasowaTabela;

    System.out.println("Elementy tablicy liczby:");

    for (int x : liczby) {
      System.out.print(x + ", ");
    }
  }
}
