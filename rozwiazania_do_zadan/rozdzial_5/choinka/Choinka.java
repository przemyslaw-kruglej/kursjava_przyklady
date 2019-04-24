import java.util.Scanner;

public class Choinka {
  public static void main(String[] args) {
    System.out.print("Podaj liczbe gwiazdek w podstawie: ");
    int liczbaGwiazdekWPodstawie = getInt();

    // liczba gwiazdek w pierwszym rzedzie, czyli
    // na szczycie choinki, zalezy od tego, czy
    // liczba gwiazdek w podstawie jest parzysta, czy nie
    // w kazdym rzedzie sa o 2 gwiazdki mniej,
    // niz w rzedzie ponizej, wiec na szczycie beda
    // 2 gwiazdki, gdy w podstawie jest parzysta liczba gwiazdek,
    // albo 1 gwiazdka, gdy podstawa ma nieparzysta liczbe gwiazdek
    int liczbaGwiazdekNaSzczycie = liczbaGwiazdekWPodstawie % 2 == 0 ? 2 : 1;

    // petla rozpoczyna dzialania od wypisania tylu gwiazdek, ile jest
    //  na szczycie
    // petla dziala dopoki, liczba gwiazdek do wypisania w rzedzie
    //  nie przekroczy liczby gwiazdek w podstawie
    // na koncu kazdego obiegu, zwiekszamy liczbe gwiazdek o 2,
    //  bo w kazdym kolejnym rzedzie sa o 2 gwiazdki wiecej,
    //  niz w poprzednim
    for (int gwiazdkiWRzedzie = liczbaGwiazdekNaSzczycie;
         gwiazdkiWRzedzie <= liczbaGwiazdekWPodstawie;
         gwiazdkiWRzedzie += 2) {

      // przed gwiazdkami musimy wypisac odpowiednia liczbe spacji,
      // aby gwiazdki byly ladnie wysrodkowane
      // liczba spacji do wypisania rowna jest polowie roznicy gwiazdek
      // w podstawie i w aktualnym rzedzie
      int liczbaSpacji = (liczbaGwiazdekWPodstawie - gwiazdkiWRzedzie) / 2;

      for (int i = 0; i < liczbaSpacji + gwiazdkiWRzedzie; i++) {
        // najpierw wypisujemy odpowiednia liczbe spacji, a potem gwiazdki,
        // wiec sprawdzamy wartosc zmiennej i - na jej podstawie wyznaczamy,
        // czy wypisac spacje, czy juz gwiazdke
        System.out.print(i < liczbaSpacji ? " " : "*");
      }

      // wypisujemy znak nowej linii, by kolejny
      // rzad gwiazdek byl wypisywany w nastepnej linii
      System.out.println();
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}