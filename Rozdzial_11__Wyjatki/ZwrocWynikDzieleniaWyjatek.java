public class ZwrocWynikDzieleniaWyjatek {
  public static void main(String[] args) {
    try {
      System.out.println(podziel(10, 0));
    } catch (ArithmeticException e) {
      System.out.println("Nie wolno dzielic przez 0!");
      System.out.println("Wystapil blad: " + e.getMessage());
    }

    try {
      System.out.println("Zaraz podzielimy 10 przez 2");
      System.out.println("Wynik dzielenia: " + podziel(10, 2));
      System.out.println("Podzielilismy 10 przez 2");
    } catch (ArithmeticException e) {
      System.out.println("Wystapil blad podczas dzielenia przez 2!");
    } finally {
      System.out.println("Blok try..catch..finally zakonczony!");
    }

    try {
      System.out.println("Zaraz podzielimy 10 przez ZERO!");
      System.out.println("Wynik dzielenia: " + podziel(10, 0));
      // ponizszy komunikat nie zostanie wypisany, poniewaz
      // poprzednia linia spowoduje rzucenie wyjatku dzielenia przez 0,
      // co spowoduje przejscie wykonania programu do sekcji catch
      System.out.println("Podzielilismy 10 przez ZERO!");
    } catch (ArithmeticException e) {
      System.out.println("Wystapil blad podczas dzielenia przez ZERO!");
    } finally {
      System.out.println("Blok try..catch..finally zakonczony!");
    }
  }

  public static int podziel(int a, int b) {
    return a / b;
  }
}
