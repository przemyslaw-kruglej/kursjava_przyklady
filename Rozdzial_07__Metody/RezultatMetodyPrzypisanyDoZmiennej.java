public class RezultatMetodyPrzypisanyDoZmiennej {
  public static void main(String[] args) {
    int kwadrat = podniesDoKwadratu(16);

    /* zakomentowana linijka, poniewaz powoduje ona blad kompilacji
       nie mozna przypisac liczby do zmiennej typu String:
        error: incompatible types: int cannot be converted to String
    */
    // String tekst = podniesDoKwadratu(16);
  }

  public static int podniesDoKwadratu(int liczba) {
    return liczba * liczba;
  }
}
